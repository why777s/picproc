package service.impl;

import service.PicsService;
import util.Detect;

/**
 * Created by why777s on 2017/6/18.
 */
public class PicsServiceImpl implements PicsService{

    public String pronResult(String path){
        Detect detect = new Detect();
        return detect.pronLevel(path);
    }

    public String terrorResult(String path) {
        Detect detect = new Detect();
        return detect.terrorLevel(path);
    }
}
