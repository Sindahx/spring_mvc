package com.dffx.dto;

public class Upload {

	private String fileName;
	private Integer finish; // 文件上传状态,0: 正在上传 1: 上传结束, 2: 上传失败
	private String url;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public Integer getFinish() {
		return finish;
	}

	public void setFinish(Integer finish) {
		this.finish = finish;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
