package org.example.generics;
import java.util.*;

public class MediaItem {
    private int mediaId;
    private String title;

    public MediaItem(int mediaId, String title) {
        this.mediaId = mediaId;
        this.title = title;
    }

    public int getMediaId() { return mediaId; }
    public String getTitle() { return title; }
    public void setMediaId(int mediaId) { this.mediaId = mediaId; }
    public void setTitle(String title) { this.title = title; }
}

class Movie extends MediaItem {
    public Movie(int mediaId, String title) {
        super(mediaId, title);
    }
}

class Music extends MediaItem {
    public Music(int mediaId, String title) {
        super(mediaId, title);
    }
}

class Library2<T extends MediaItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public List<T> filterByTitle(String title) {
        List<T> result = new ArrayList<>();

        for (T item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                result.add(item);
            }
        }

        return result;
    }

    public T getByMediaId(int mediaId) {
        for (T item : items) {
            if (item.getMediaId() == mediaId) {
                return item;
            }
        }

        return null;
    }
}