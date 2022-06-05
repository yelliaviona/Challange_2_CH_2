package Repository;

import java.util.HashMap;
import java.util.List;

public interface ReadFileRepository {
    Integer countMode(List<Integer> getList);
    Double countMean(List<Integer> getList);
    double countMedian(List<Integer> getList);
    List<Integer> readFile();
    Integer getMoreThanMode(HashMap<Integer,Integer> getMapMode, int divider);
    HashMap<Integer, Integer> countMultipleMode(List<Integer> getList);
    Integer getLessThanMode(HashMap<Integer,Integer> getMapMode, int divider);

}
