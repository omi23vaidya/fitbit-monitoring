package com.fitbit.api.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Omkar Vaidya on 4/10/2017.
 */

public class ActivitiesHeartIntraday {

    @SerializedName("dataset")
    @Expose
    private List<DatasetObj> dataset;

    @SerializedName("datasetInterval")
    @Expose
    private String datasetInterval;

    @SerializedName("datasetType")
    @Expose
    private String datasetType;

    public List<DatasetObj> getDataset() {
        return dataset;
    }

    public void setDataset(List<DatasetObj> dataset) {
        this.dataset = dataset;
    }

    public String getDatasetInterval() {
        return datasetInterval;
    }

    public void setDatasetInterval(String datasetInterval) {
        this.datasetInterval = datasetInterval;
    }

    public String getDatasetType() {
        return datasetType;
    }

    public void setDatasetType(String datasetType) {
        this.datasetType = datasetType;
    }
}
