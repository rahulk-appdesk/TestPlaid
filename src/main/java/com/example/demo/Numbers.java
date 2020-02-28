
package com.example.demo;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Numbers {

    @Expose
    private List<Ach> ach;
    @Expose
    private List<Object> eft;

    public List<Ach> getAch() {
        return ach;
    }

    public void setAch(List<Ach> ach) {
        this.ach = ach;
    }

    public List<Object> getEft() {
        return eft;
    }

    public void setEft(List<Object> eft) {
        this.eft = eft;
    }

}
