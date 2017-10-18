package com.rosinante24.statistikgempa.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rosinante24 on 18/10/17.
 */

public class PojoGempaDirasakan {
    @SerializedName("data")
    private List<DataGempaDirasakan> dataGempaDirasakanList;

    public List<DataGempaDirasakan> getDataGempaDirasakanList() {
        return dataGempaDirasakanList;
    }

    public class DataGempaDirasakan {
        @SerializedName("waktu")
        private String waktugempadirasakan;
        @SerializedName("lintang_bujur")
        private String lintangbujurgempadirasakan;
        @SerializedName("magnitudo")
        private String magnitudogempadirasakan;
        @SerializedName("kedalaman")
        private String kedalamangempadirasakan;
        @SerializedName("wilayah")
        private String wilayahgempadirasakan;
        @SerializedName("img")
        private String urlimagegempadirasakan;
        @SerializedName("dirasakan")
        private List<String> dirasakanlist;

        public String getWaktugempadirasakan() {
            return waktugempadirasakan;
        }

        public String getLintangbujurgempadirasakan() {
            return lintangbujurgempadirasakan;
        }

        public String getMagnitudogempadirasakan() {
            return magnitudogempadirasakan;
        }

        public String getKedalamangempadirasakan() {
            return kedalamangempadirasakan;
        }

        public String getWilayahgempadirasakan() {
            return wilayahgempadirasakan;
        }

        public String getUrlimagegempadirasakan() {
            return urlimagegempadirasakan;
        }

        public List<String> getDirasakanlist() {
            return dirasakanlist;
        }
    }
}
