package gradle_app;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="information")
public class InformationEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	  private long id;
	private String id_;
	private String type_;
	private String host;
	private long duration;
	private boolean alert;
	
	public InformationEntity(String id_, String type_, String host, long duration, boolean alert) {
		super();
		this.id_ = id_;
		this.type_ = type_;
		this.host = host;
		this.duration = duration;
		this.alert = alert;
	}
	
	public InformationEntity() {
		super();
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getId_() {
		return id_;
	}
	public void setId_(String id_) {
		this.id_ = id_;
	}
	public String getType_() {
		return type_;
	}
	public void setType_(String type_) {
		this.type_ = type_;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public boolean isAlert() {
		return alert;
	}
	public void setAlert(boolean alert) {
		this.alert = alert;
	} 
	
}
