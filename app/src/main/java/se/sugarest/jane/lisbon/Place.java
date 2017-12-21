package se.sugarest.jane.lisbon;

/**
 * Created by jane on 17-12-21.
 */

public class Place {

    /**
     * Name string resource Id for the place
     */
    private int mPlaceName;

    /**
     * Short description string resource Id for the place
     */
    private int mShortDescription;

    /**
     * Website resource Id of the place
     */
    private int mWebsite;

    /**
     * Image resource Id for the place
     */
    private int mImageResourceId;

    /**
     * Create a new Place object.
     *
     * @param placeName        is the string resource Id for the name of the place
     * @param shortDescription is the string resource Id for the short description of the place
     * @param website          is the string resource Id for the website of the place
     * @param imageResourceId  is the drawable resource ID for the image associated with the place
     */
    public Place(int placeName, int shortDescription, int website, int imageResourceId) {
        mPlaceName = placeName;
        mShortDescription = shortDescription;
        mWebsite = website;
        mImageResourceId = imageResourceId;
    }

    /**
     * @return the string resource Id for the name of the place.
     */
    public int getPlaceName() {
        return mPlaceName;
    }

    /**
     * @return the string resource Id for the short description of the place.
     */
    public int getShortDescription() {
        return mShortDescription;
    }

    /**
     * @return string resource Id for the website of the place.
     */
    public int getWebsite() {
        return mWebsite;
    }

    /**
     * @return the drawable resource ID for the image associated with the place.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

}
