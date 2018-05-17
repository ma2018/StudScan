

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Section {

@SerializedName("heading")
@Expose
private Object heading;
@SerializedName("text")
@Expose
private String text;

public Object getHeading() {
return heading;
}

public void setHeading(Object heading) {
this.heading = heading;
}

public String getText() {
return text;
}

public void setText(String text) {
this.text = text;
}

}