package gradle_app;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Information {

	public String id;
	public String state;
	public String type;
	public String host;
	public long timestamp;

	public Information() {

	}

	public Information(String id, String state, String type, String host, long timestamp) {
		super();
		this.id = id;
		this.state = state;
		this.type = type;
		this.host = host;
		this.timestamp = timestamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	List<Information> parseInformationObject(JSONArray infoList) {
		List<Information> in = new ArrayList<>();

		infoList.forEach(emp -> {

			JSONObject info = (JSONObject) emp;

			String id = info.get("id").toString();
			String state = info.get("state").toString();
			String type = null;
			if (info.get("type") != null) {
				type = info.get("type").toString();
			}
			String host = null;
			if (info.get("host") != null) {
				host = info.get("host").toString();
			}
			long timestamp = (long) info.get("timestamp");

			in.add(new Information(id, state, type, host, timestamp));

		});
		return in;
	}

}
