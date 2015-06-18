package com.fteams.siftrain.entities;

import com.fteams.siftrain.util.SongUtils;

import java.io.File;

public class SimpleSong implements Comparable<SimpleSong> {
    public String song_name;
    public Integer difficulty;
    public SimpleRankInfo[] rank_info;
    public SimpleSongInfo[] song_info;
    private File file;
    private String resourceName;

    public String toString() {
        return song_name + " [" + SongUtils.getDifficulty(difficulty) + "]";
    }


    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
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
}
