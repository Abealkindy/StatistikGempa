package com.rosinante24.statistikgempa.POJO;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Rosinante24 on 18/10/17.
 */

public class PojoGempaTerkini {

    @SerializedName("data")
    private List<DataGempaTerkini> dataGempaTerkiniList;

    public List<DataGempaTerkini> getDataGempaTerkiniList() {
        return dataGempaTerkiniList;
    }

    public void setDataGempaTerkiniList(List<DataGempaTerkini> dataGempaTerkiniList) {
        this.dataGempaTerkiniList = dataGempaTerkiniList;
    }

    public class DataGempaTerkini {

        @SerializedName("waktu")
        private String waktugempaterkini;
        @SerializedName("lintang_bujur")
        private String lintangbujurgempaterkini;
        @SerializedName("magnitudo")
        private String magnitudogempaterkini;
        @SerializedName("kedalaman")
        private String kedalamangempaterkini;
        @SerializedName("wilayah")
        private String wilayahgempaterkini;
        @SerializedName("img")
        private String urlimagegempaterkini;

        public String getWaktugempaterkini() {
            return waktugempaterkini;
        }

        public void setWaktugempaterkini(String waktugempaterkini) {
            this.waktugempaterkini = waktugempaterkini;
        }

        public String getLintangbujurgempaterkini() {
            return lintangbujurgempaterkini;
        }

        public void setLintangbujurgempaterkini(String lintangbujurgempaterkini) {
            this.lintangbujurgempaterkini = lintangbujurgempaterkini;
        }

        public String getMagnitudogempaterkini() {
            return magnitudogempaterkini;
        }

        public void setMagnitudogempaterkini(String magnitudogempaterkini) {
            this.magnitudogempaterkini = magnitudogempaterkini;
        }

        public String getKedalamangempaterkini() {
            return kedalamangempaterkini;
        }

        public void setKedalamangempaterkini(String kedalamangempaterkini) {
            this.kedalamangempaterkini = kedalamangempaterkini;
        }

        public String getWilayahgempaterkini() {
            return wilayahgempaterkini;
        }

        public void setWilayahgempaterkini(String wilayahgempaterkini) {
            this.wilayahgempaterkini = wilayahgempaterkini;
        }

        public String getUrlimagegempaterkini() {
            return urlimagegempaterkini;
        }

        public void setUrlimagegempaterkini(String urlimagegempaterkini) {
            this.urlimagegempaterkini = urlimagegempaterkini;
        }
    }
}
