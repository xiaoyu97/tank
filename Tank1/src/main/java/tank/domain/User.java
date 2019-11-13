package tank.domain;

import java.util.Date;

/**
 * @author CXY
 * @date 2019-11-04 19:35
 * 描述信息：
 */
public class User {
    private Integer id;
    private String projectName;
    private String projectLink;
    private Date begin;
    private Date end;
    private String projectDesc;
    private String achievement;
    private Integer isDelete;
    private Integer userId;

    public User() {
    }

    public User(String projectName, String projectLink, Date begin, Date end, String projectDesc, String achievement, Integer isDelete, Integer userId) {
        this.projectName = projectName;
        this.projectLink = projectLink;
        this.begin = begin;
        this.end = end;
        this.projectDesc = projectDesc;
        this.achievement = achievement;
        this.isDelete = isDelete;
        this.userId=userId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectLink() {
        return projectLink;
    }

    public void setProjectLink(String projectLink) {
        this.projectLink = projectLink;
    }

    public Date getBegin() {
        return begin;
    }

    public void setBegin(Date begin) {
        this.begin = begin;
    }

    public Date getEnd() {
        return end;
    }

    public void setEnd(Date end) {
        this.end = end;
    }

    public String getProjectDesc() {
        return projectDesc;
    }

    public void setProjectDesc(String projectDesc) {
        this.projectDesc = projectDesc;
    }

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectLink='" + projectLink + '\'' +
                ", begin=" + begin +
                ", end=" + end +
                ", projectDesc='" + projectDesc + '\'' +
                ", achievement='" + achievement + '\'' +
                ", isDelete=" + isDelete +
                ", userId=" + userId +
                '}';
    }
}
