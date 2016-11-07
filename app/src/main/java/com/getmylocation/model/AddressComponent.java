package com.getmylocation.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

@Generated("org.jsonschema2pojo")

/**
 * Created by Tosin Onikute on 10/10/16.
 */

public class AddressComponent {

        @SerializedName("long_name")
        private String longName;
        @SerializedName("short_name")
        private String shortName;
        private List<String> types = new ArrayList<String>();
        private Map<String, Object> additionalProperties = new HashMap<String, Object>();

        /**
         *
         * @return
         * The longName
         */
        public String getLongName() {
            return longName;
        }

        /**
         *
         * @param longName
         * The long_name
         */
        public void setLongName(String longName) {
            this.longName = longName;
        }

        /**
         *
         * @return
         * The shortName
         */
        public String getShortName() {
            return shortName;
        }

        /**
         *
         * @param shortName
         * The short_name
         */
        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        /**
         *
         * @return
         * The types
         */
        public List<String> getTypes() {
            return types;
        }

        /**
         *
         * @param types
         * The types
         */
        public void setTypes(List<String> types) {
            this.types = types;
        }

        public Map<String, Object> getAdditionalProperties() {
            return this.additionalProperties;
        }

        public void setAdditionalProperty(String name, Object value) {
            this.additionalProperties.put(name, value);
        }

}
