package models;

import io.swagger.annotations.ApiModelProperty;

public class ModelWithModelPropertyOverrides {
    @ApiModelProperty(dataType = "List[models.Children]")
    private String children;

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }
}