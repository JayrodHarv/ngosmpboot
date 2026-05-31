package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "Image")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ImageID;

    private String FileName;
    private String MimeType;
    private long FileSize;
    private String FilePath;
    private LocalDateTime CreatedAt;
    private String FileHash;
    
    public Integer getImageID() {
        return ImageID;
    }
    public void setImageID(Integer ImageID) {
        this.ImageID = ImageID;
    }
    public String getFileName() {
        return FileName;
    }
    public void setFileName(String FileName) {
        this.FileName = FileName;
    }
    public String getMimeType() {
        return MimeType;
    }
    public void setMimeType(String MimeType) {
        this.MimeType = MimeType;
    }
    public long getFileSize() {
        return FileSize;
    }
    public void setFileSize(long FileSize) {
        this.FileSize = FileSize;
    }
    public String getFilePath() {
        return FilePath;
    }
    public void setFilePath(String FilePath) {
        this.FilePath = FilePath;
    }
    public LocalDateTime getCreatedAt() {
        return CreatedAt;
    }
    public void setCreatedAt(LocalDateTime CreatedAt) {
        this.CreatedAt = CreatedAt;
    }
    public String getFileHash() {
        return FileHash;
    }
    public void setFileHash(String FileHash) {
        this.FileHash = FileHash;
    }

    
}
