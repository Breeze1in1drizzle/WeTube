package com.Rise435.WeTube.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Film extends BaseEntity {

	//Film:电影
	
	private static final long serialVersionUID = 1L;
	
	private Integer fid;//电影id
	private String filmName;//电影名称
	private String filmImages;//电影海报图
	private String filmType;//电影类型
	private String filmFeature;//电影类型
	private String filmPosition;//地区
	private String filmLasttime;//电影时长
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date filmShowtime;//上映时间
	private Date filmEndtime;//下架时间
	private String filmScore;//电影评分或想看数
	private String filmIntroduce;//电影简介
	private String filmPictures;//电影剧照
	@Override
	public String toString() {
		return "Film [fid=" + fid + ", filmName=" + filmName + ", filmImages=" + filmImages + ", filmType=" + filmType
				+ ", filmFeature=" + filmFeature + ", filmPosition=" + filmPosition + ", filmLasttime=" + filmLasttime
				+ ", filmShowtime=" + filmShowtime + ", filmEndtime=" + filmEndtime + ", filmScore=" + filmScore
				+ ", filmIntroduce=" + filmIntroduce + ", filmPictures=" + filmPictures + "]";
	}
	public Integer getFid() {
		return fid;
	}
	public void setFid(Integer fid) {
		this.fid = fid;
	}
	public String getFilmName() {
		return filmName;
	}
	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}
	public String getFilmImages() {
		return filmImages;
	}
	public void setFilmImages(String filmImages) {
		this.filmImages = filmImages;
	}
	public String getFilmType() {
		return filmType;
	}
	public void setFilmType(String filmType) {
		this.filmType = filmType;
	}
	public String getFilmFeature() {
		return filmFeature;
	}
	public void setFilmFeature(String filmFeature) {
		this.filmFeature = filmFeature;
	}
	public String getFilmPosition() {
		return filmPosition;
	}
	public void setFilmPosition(String filmPosition) {
		this.filmPosition = filmPosition;
	}
	public String getFilmLasttime() {
		return filmLasttime;
	}
	public void setFilmLasttime(String filmLasttime) {
		this.filmLasttime = filmLasttime;
	}
	public Date getFilmShowtime() {
		return filmShowtime;
	}
	public void setFilmShowtime(Date filmShowtime) {
		this.filmShowtime = filmShowtime;
	}
	public Date getFilmEndtime() {
		return filmEndtime;
	}
	public void setFilmEndtime(Date filmEndtime) {
		this.filmEndtime = filmEndtime;
	}
	public String getFilmScore() {
		return filmScore;
	}
	public void setFilmScore(String filmScore) {
		this.filmScore = filmScore;
	}
	public String getFilmIntroduce() {
		return filmIntroduce;
	}
	public void setFilmIntroduce(String filmIntroduce) {
		this.filmIntroduce = filmIntroduce;
	}
	public String getFilmPictures() {
		return filmPictures;
	}
	public void setFilmPictures(String filmPictures) {
		this.filmPictures = filmPictures;
	}
}
