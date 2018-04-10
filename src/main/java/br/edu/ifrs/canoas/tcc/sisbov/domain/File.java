package br.edu.ifrs.canoas.tcc.sisbov.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.util.Base64Utils;

@Entity
public class File {
	
	@Id
	@GeneratedValue
	private Long cod;
	
	private String description;
	
	private String filename;
	
	@Column(length = 2147483647)
	private byte[] content;
	
	private String contentType;
	
	private Date createdOn;

	public String getPictureBase64() {
		return (content == null ? "/img/tio.png"
				: "data:image/png;base64," + Base64Utils.encodeToString(content));
	}

	public Long getCod() {
		return cod;
	}

	public void setCod(Long cod) {
		this.cod = cod;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
}
