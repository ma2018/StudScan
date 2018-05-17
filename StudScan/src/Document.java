

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Document {

@SerializedName("name")
@Expose
private String name;
@SerializedName("metadata")
@Expose
private Metadata metadata;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Metadata getMetadata() {
return metadata;
}

public void setMetadata(Metadata metadata) {
this.metadata = metadata;
}

}