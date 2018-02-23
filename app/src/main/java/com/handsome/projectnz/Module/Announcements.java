package com.handsome.projectnz.Module;

import java.util.List;

/**
 * Created by jie on 2018/1/15.
 */


public class Announcements {

    /**
     * status : true
     * content : {"status":true,"content":[{"title":"来做我的小弟吧","publish_time":1518703666,"content":"要么被我们收购，要么被我们抄跨","image":"53920e22108a645bbf8ecb88b7375027.jpg,9039c1974e75003077c681d720133c8c.jpg,2bee544a3395bb638aa55de5cf5f9bf8.jpg,a7a3527203562e8e1e8ba3e938bd206d.jpg","validity":1519236122,"cid":221,"unit_name":"腾讯","isread":1,"id":61},{"title":"来做我的小弟吧","publish_time":1518703595,"content":"要么被我们收购，要么被我们抄跨","image":"ed42f21f6ad63eae74bf30a5977ca9ba.jpg,1db136ba7a8807ba58e4e041473a533e.jpg,ab33a3db6feaec535c8184656ee678cd.jpg,270d002694d400807628c94ce3a6d01f.jpg","validity":1519236122,"cid":221,"unit_name":"腾讯","isread":0,"id":60}]}
     */

    private boolean status;
    /**
     * status : true
     * content : [{"title":"来做我的小弟吧","publish_time":1518703666,"content":"要么被我们收购，要么被我们抄跨","image":"53920e22108a645bbf8ecb88b7375027.jpg,9039c1974e75003077c681d720133c8c.jpg,2bee544a3395bb638aa55de5cf5f9bf8.jpg,a7a3527203562e8e1e8ba3e938bd206d.jpg","validity":1519236122,"cid":221,"unit_name":"腾讯","isread":1,"id":61},{"title":"来做我的小弟吧","publish_time":1518703595,"content":"要么被我们收购，要么被我们抄跨","image":"ed42f21f6ad63eae74bf30a5977ca9ba.jpg,1db136ba7a8807ba58e4e041473a533e.jpg,ab33a3db6feaec535c8184656ee678cd.jpg,270d002694d400807628c94ce3a6d01f.jpg","validity":1519236122,"cid":221,"unit_name":"腾讯","isread":0,"id":60}]
     */

    private ContentBean content;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public static class ContentBean {
        private boolean status;
        /**
         * title : 来做我的小弟吧
         * publish_time : 1518703666
         * content : 要么被我们收购，要么被我们抄跨
         * image : 53920e22108a645bbf8ecb88b7375027.jpg,9039c1974e75003077c681d720133c8c.jpg,2bee544a3395bb638aa55de5cf5f9bf8.jpg,a7a3527203562e8e1e8ba3e938bd206d.jpg
         * validity : 1519236122
         * cid : 221
         * unit_name : 腾讯
         * isread : 1
         * id : 61
         */

        private List<ContentBeanBean> content;

        public boolean isStatus() {
            return status;
        }

        public void setStatus(boolean status) {
            this.status = status;
        }

        public List<ContentBeanBean> getContent() {
            return content;
        }

        public void setContent(List<ContentBeanBean> content) {
            this.content = content;
        }

        public static class ContentBeanBean {
            private String title;
            private int publish_time;
            private String content;
            private String image;
            private long validity;
            private int cid;
            private String unit_name;
            private int isread;
            private int id;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getPublish_time() {
                return publish_time;
            }

            public void setPublish_time(int publish_time) {
                this.publish_time = publish_time;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public long getValidity() {
                return validity;
            }

            public void setValidity(long validity) {
                this.validity = validity;
            }

            public int getCid() {
                return cid;
            }

            public void setCid(int cid) {
                this.cid = cid;
            }

            public String getUnit_name() {
                return unit_name;
            }

            public void setUnit_name(String unit_name) {
                this.unit_name = unit_name;
            }

            public int getIsread() {
                return isread;
            }

            public void setIsread(int isread) {
                this.isread = isread;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}