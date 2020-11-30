package edu.ptit.da2020.model.dto;

import edu.ptit.da2020.model.GeoPoint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Moving {
    protected String type;
    private List<GeoPoint> route;

    public void setRoute(List<GeoPoint> route) {
        this.route = route;
    }
}
