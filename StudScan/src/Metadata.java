

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

@SerializedName("source")
@Expose
private String source;
@SerializedName("title")
@Expose
private Object title;
@SerializedName("authors")
@Expose
private List<Object> authors = null;
@SerializedName("emails")
@Expose
private List<Object> emails = null;
@SerializedName("sections")
@Expose
private List<Section> sections = null;
@SerializedName("references")
@Expose
private List<Object> references = null;
@SerializedName("referenceMentions")
@Expose
private List<Object> referenceMentions = null;
@SerializedName("year")
@Expose
private Integer year;
@SerializedName("abstractText")
@Expose
private Object abstractText;
@SerializedName("creator")
@Expose
private String creator;

public String getSource() {
return source;
}

public void setSource(String source) {
this.source = source;
}

public Object getTitle() {
return title;
}

public void setTitle(Object title) {
this.title = title;
}

public List<Object> getAuthors() {
return authors;
}

public void setAuthors(List<Object> authors) {
this.authors = authors;
}

public List<Object> getEmails() {
return emails;
}

public void setEmails(List<Object> emails) {
this.emails = emails;
}

public List<Section> getSections() {
return sections;
}

public void setSections(List<Section> sections) {
this.sections = sections;
}

public List<Object> getReferences() {
return references;
}

public void setReferences(List<Object> references) {
this.references = references;
}

public List<Object> getReferenceMentions() {
return referenceMentions;
}

public void setReferenceMentions(List<Object> referenceMentions) {
this.referenceMentions = referenceMentions;
}

public Integer getYear() {
return year;
}

public void setYear(Integer year) {
this.year = year;
}

public Object getAbstractText() {
return abstractText;
}

public void setAbstractText(Object abstractText) {
this.abstractText = abstractText;
}

public String getCreator() {
return creator;
}

public void setCreator(String creator) {
this.creator = creator;
}

}