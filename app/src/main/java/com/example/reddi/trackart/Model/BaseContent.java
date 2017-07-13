package com.example.reddi.trackart.Model;

/**
 * Created by Reddi on 10/07/2017.
 */

public class BaseContent {

    public String Title;
    public String Description;
    public String ImgUrl;

    public ContentType ctype;

    public BaseContent(
            String Title,
            String Description,
            String ImgUrl,
            ContentType ctype
    ){
        this.Title = Title;
        this.Description = Description;
        this.ImgUrl = ImgUrl;
        this.ctype = ctype;
    }



}
