package org.example.cleancode;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class File {
    private Integer id;
    private Boolean flagged;
    private List<String> files;

    public File() {
        files = new ArrayList<>();
    }

    public File(Integer id) {
        this.id = id;
    }

    public File(Boolean flagged) {
        this.flagged = flagged;
    }

    public File(Integer id, Boolean flagged) {
        this.id = id;
        this.flagged = flagged;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getFlagged() {
        return flagged;
    }

    public void setFlagged(Boolean flagged) {
        this.flagged = flagged;
    }

    public List<String> getFiles() {
        return files;
    }

    public void setFiles(List<String> files) {
        this.files = files;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        File file = (File) o;
        return Objects.equals(id, file.id) && Objects.equals(flagged, file.flagged);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, flagged);
    }

}
