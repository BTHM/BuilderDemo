package com.pingan.builderpattern;


/**
 * Author：liupeng264 on 2016/11/14 15:22
 * Address：liupeng264@pingan.com.cn
 */
public class HotDryNoodlesWithBuilder {
    private boolean addShallot;//加葱花
    private boolean addParsley;// 香菜
    private boolean addChili;  //辣椒
    private boolean addSauerkraut;//酸菜

    //Director
    public HotDryNoodlesWithBuilder(Builder builder) {

        this.addShallot = builder.addShallot;
        this.addParsley = builder.addParsley;
        this.addChili = builder.addChili;
        this.addSauerkraut = builder.addSauerkraut;
    }


    //product
    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("A bowl of hot-dry noodles has:");

        if (this.addShallot) {
            sb.append("葱花.");
        }

        if (this.addParsley) {
            sb.append("香菜.");
        }

        if (this.addChili) {
            sb.append("辣椒.");
        }

        if (this.addSauerkraut) {
            sb.append("酸菜.");
        }

        return sb.toString();
    }


    public static class Builder {

        private boolean addShallot;
        private boolean addParsley;
        private boolean addChili;
        private boolean addSauerkraut;

        //Builder
        public Builder() {

        }

        /**--- ConcreateBuilder start --**/
        public Builder withShallot() {
            this.addShallot = true;
            return this;
        }

        public Builder withParsley() {
            this.addParsley = true;
            return this;
        }

        public Builder withChili() {
            this.addChili = true;
            return this;
        }

        public Builder withSauerkraut() {
            this.addSauerkraut = true;
            return this;
        }
        /**--- ConcreateBuilder end --**/


        public HotDryNoodlesWithBuilder build() {
            return new HotDryNoodlesWithBuilder(this);
        }
    }
}
