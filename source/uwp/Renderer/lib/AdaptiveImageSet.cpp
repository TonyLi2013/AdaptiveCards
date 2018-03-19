#include "pch.h"
#include "AdaptiveImageSet.h"

#include "Util.h"
#include "Vector.h"
#include <windows.foundation.collections.h>

using namespace Microsoft::WRL;
using namespace Microsoft::WRL::Wrappers;
using namespace ABI::AdaptiveCards::Rendering::Uwp;
using namespace ABI::Windows::Foundation::Collections;
using namespace ABI::Windows::UI::Xaml;
using namespace ABI::Windows::UI::Xaml::Controls;

namespace AdaptiveCards { namespace Rendering { namespace Uwp
{
    AdaptiveImageSet::AdaptiveImageSet()
    {
        m_images = Microsoft::WRL::Make<Vector<IAdaptiveImage*>>();
    }

    HRESULT AdaptiveImageSet::RuntimeClassInitialize() noexcept try
    {
        std::shared_ptr<AdaptiveCards::ImageSet> imageSet = std::make_shared<AdaptiveCards::ImageSet>();
        return RuntimeClassInitialize(imageSet);
    } CATCH_RETURN;

    _Use_decl_annotations_
    HRESULT AdaptiveImageSet::RuntimeClassInitialize(const std::shared_ptr<AdaptiveCards::ImageSet>& sharedImageSet) try
    {
        if (sharedImageSet == nullptr)
        {
            return E_INVALIDARG;
        }

        GenerateImagesProjection(sharedImageSet->GetImages(), m_images.Get());

        m_imageSize = static_cast<ABI::AdaptiveCards::Rendering::Uwp::ImageSize>(sharedImageSet->GetImageSize());
        
        InitializeBaseElement(std::static_pointer_cast<BaseCardElement>(sharedImageSet));
        return S_OK;
    } CATCH_RETURN;

    _Use_decl_annotations_
        IFACEMETHODIMP AdaptiveImageSet::get_Images(IVector<IAdaptiveImage*>** images)
    {
        return m_images.CopyTo(images);
    }

    _Use_decl_annotations_
    HRESULT AdaptiveImageSet::get_ImageSize(ABI::AdaptiveCards::Rendering::Uwp::ImageSize* imageSize)
    {
        *imageSize = m_imageSize;
        return S_OK;
    }

    _Use_decl_annotations_
    HRESULT AdaptiveImageSet::put_ImageSize(ABI::AdaptiveCards::Rendering::Uwp::ImageSize imageSize)
    {
        m_imageSize = imageSize;
        return S_OK; 
    }

    _Use_decl_annotations_
    IFACEMETHODIMP AdaptiveImageSet::get_ElementType(ElementType* elementType)
    {
        *elementType = ElementType::ImageSet;
        return S_OK;
    }

    HRESULT AdaptiveImageSet::GetSharedModel(std::shared_ptr<AdaptiveCards::BaseCardElement>& sharedModel) try
    {
        std::shared_ptr<AdaptiveCards::ImageSet> imageSet = std::make_shared<AdaptiveCards::ImageSet>();

        RETURN_IF_FAILED(SetSharedElementProperties(std::static_pointer_cast<AdaptiveCards::BaseCardElement>(imageSet)));

        imageSet->SetImageSize(static_cast<AdaptiveCards::ImageSize>(m_imageSize));

        RETURN_IF_FAILED(GenerateSharedImages(m_images.Get(), imageSet->GetImages()));

        sharedModel = imageSet;
        return S_OK;
    }CATCH_RETURN;
}}}
