package com.sgl.designpattern.chain_of_responsibility.module.basemodule;/**
 * Created by Ni Klaus on 2019/9/24 0024
 */

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import java.util.Date;

/**
 *@ClassName BasePojo
 *@Description TODO
 *@Author Ni Klaus
 *@Date 2019/9/24 0024 下午 14:48
 *@Version 1.0
 */
public class BasePojo implements Serializable {

    protected Long id;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )

    protected Date createTime;
    @JsonFormat(
            pattern = "yyyy-MM-dd HH:mm:ss",
            timezone = "GMT+8"
    )

    protected Date updateTime;

    @JsonIgnore
    private boolean state;

    @JsonIgnore
    private int isDelete = 1;

    public Long getId() {
        return this.id;
    }

    public Date getCreateTime() {
        return this.createTime;
    }

    public Date getUpdateTime() {
        return this.updateTime;
    }

    public boolean isState() {
        return this.state;
    }

    public int getIsDelete() {
        return this.isDelete;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof BasePojo)) {
            return false;
        } else {
            BasePojo other = (BasePojo)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                label55: {
                    Object this$id = this.getId();
                    Object other$id = other.getId();
                    if (this$id == null) {
                        if (other$id == null) {
                            break label55;
                        }
                    } else if (this$id.equals(other$id)) {
                        break label55;
                    }

                    return false;
                }

                Object this$createTime = this.getCreateTime();
                Object other$createTime = other.getCreateTime();
                if (this$createTime == null) {
                    if (other$createTime != null) {
                        return false;
                    }
                } else if (!this$createTime.equals(other$createTime)) {
                    return false;
                }

                label41: {
                    Object this$updateTime = this.getUpdateTime();
                    Object other$updateTime = other.getUpdateTime();
                    if (this$updateTime == null) {
                        if (other$updateTime == null) {
                            break label41;
                        }
                    } else if (this$updateTime.equals(other$updateTime)) {
                        break label41;
                    }

                    return false;
                }

                if (this.isState() != other.isState()) {
                    return false;
                } else if (this.getIsDelete() != other.getIsDelete()) {
                    return false;
                } else {
                    return true;
                }
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof BasePojo;
    }

    public int hashCode() {
        //int PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $createTime = this.getCreateTime();
        result = result * 59 + ($createTime == null ? 43 : $createTime.hashCode());
        Object $updateTime = this.getUpdateTime();
        result = result * 59 + ($updateTime == null ? 43 : $updateTime.hashCode());
        result = result * 59 + (this.isState() ? 79 : 97);
        result = result * 59 + this.getIsDelete();
        return result;
    }

    public String toString() {
        return "BasePojo(id=" + this.getId() + ", createTime=" + this.getCreateTime() + ", updateTime=" + this.getUpdateTime() + ", state=" + this.isState() + ", isDelete=" + this.getIsDelete() + ")";
    }

    public BasePojo(Long id, Date createTime, Date updateTime, boolean state, int isDelete) {
        this.id = id;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.state = state;
        this.isDelete = isDelete;
    }

    public BasePojo() {
    }
}
