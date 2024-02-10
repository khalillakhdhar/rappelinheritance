package com.elite.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post extends AuditModel {
	@Lob
	@Column(nullable = false,columnDefinition = "TEXT")
	private String content;
	private String description;
	@Column(nullable = false,length = 100,unique = true)
	
	private String title;
	@OneToMany(mappedBy = "post")
	private List<Comments> comments ;
	

}
