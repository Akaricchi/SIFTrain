package com.fteams.siftrain.entities;

import com.fteams.siftrain.util.SongUtils;

import java.io.File;
import java.util.List;

public class SimpleSong implements Comparable<SimpleSong> {
    public String song_name;
    public Integer difficulty;
    public List<SimpleRankInfo> rank_info;
    public List<SimpleSongInfo> song_info;
    private String resourceName;
    private Boolean valid;

    public String toString() {
        return song_name + " [" + SongUtils.getDifficulty(difficulty) + "]";
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    @Override
    public int compareTo(SimpleSong o) {
        if (!o.getResourceName().equals(resourceName)) {
            return resourceName.compareTo(o.resourceName);
        }
        if (!difficulty.equals(o.difficulty)) {
            return difficulty.compareTo(o.difficulty);
        }
        return 0;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}
