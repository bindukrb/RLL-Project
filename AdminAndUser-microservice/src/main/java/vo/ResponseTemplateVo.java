package vo;

import com.cinema.entity.Admin;

public class ResponseTemplateVo {
	
	
	private Movies movies;
	
	private Admin admin;
	
	public ResponseTemplateVo() {
		
		super();
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	public Admin getAdmin() {
		return admin;
	}

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public ResponseTemplateVo(Movies movies, Admin admin) {
		super();
		this.movies = movies;
		this.admin = admin;
	}

	@Override
	public String toString() {
		return "ResponseTemplateVo [movies=" + movies + ", admin=" + admin + "]";
	}
	
	
	

}
