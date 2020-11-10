package edu.ptit.da2020.model.dto;

import edu.ptit.da2020.model.Coordinate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Direction {
    private Coordinate from;
    private Coordinate to;
    private List<Moving> movings;
}