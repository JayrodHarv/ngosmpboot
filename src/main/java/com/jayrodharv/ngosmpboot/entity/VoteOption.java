package com.jayrodharv.ngosmpboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "VoteOption")
public class VoteOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer OptionID;

    @ManyToOne
    @JoinColumn(name = "VoteID")
    private Vote Vote;

    private String Title;

    @Column(columnDefinition = "TEXT")
    private String Description;

    @ManyToOne
    @JoinColumn(name = "ImageID")
    private Image Image;

    public Integer getOptionID() {
        return OptionID;
    }

    public void setOptionID(Integer OptionID) {
        this.OptionID = OptionID;
    }

    public Vote getVote() {
        return Vote;
    }

    public void setVote(Vote Vote) {
        this.Vote = Vote;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public Image getImage() {
        return Image;
    }

    public void setImage(Image Image) {
        this.Image = Image;
    }
}
