package com.beohar.priyesh.testfb1;

import com.google.firebase.database.IgnoreExtraProperties;

/**
 * Created by priyesh on 23/8/17.
 */
@IgnoreExtraProperties
public class Artist {

    private String artistId;
    private String artistName;
    private String artistGenre;

    public Artist(){

    }

    public Artist(String artistId, String artistName, String artistGenre) {
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId() {
        return artistId;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getArtistGenre() {
        return artistGenre;
    }
}
