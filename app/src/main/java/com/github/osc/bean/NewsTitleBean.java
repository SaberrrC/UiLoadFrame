package com.github.osc.bean;

import java.util.List;

public class NewsTitleBean {

    /**
     * code : 1
     * message : success
     * notice : {"like":0,"review":6,"letter":0,"mention":0,"fans":1}
     * result : {"items":[{"detail":"","href":"https://www.oschina.net/news/83188/2017-april-yuanchuanghui","id":83188,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_0544a761-285d-454a-b9ad-dc08e14cc55b.jpg","name":"源创会 | 武汉、长沙开始报名啦！","pubDate":"2017-03-27 14:06:26","type":6},{"detail":"","href":"https://www.oschina.net/question/2720166_2237849","id":2237849,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_f58099c5-7c6f-4073-b0bc-870a63eee130.png","name":"高手问答 | 亿级流量网站架构核心技术","pubDate":"2017-04-10 18:07:49","type":2},{"detail":"","href":"https://www.oschina.net/news/83724/tiobe-4-hack-50","id":83724,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_525a08c6-2833-42da-8b0f-475fa4c2d19c.jpg","name":"TIOBE 4 月编程语言排行榜","pubDate":"2017-04-11 17:49:32","type":6},{"detail":"","href":"https://www.oschina.net/news/83743/ai-replace-programmer","id":83743,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_d8ffd8e4-5c4a-406a-9774-0219030fac0e.jpg","name":"AI 可以编程了，程序猿们何去何从？","pubDate":"2017-04-11 17:51:23","type":6},{"detail":"","href":"https://www.oschina.net/news/83744/programmer-obstacle","id":83744,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_499a8c21-631b-43d3-9c8c-1bf5d80a5563.jpg","name":"软件开发人员的编程障碍","pubDate":"2017-04-11 17:52:59","type":6}],"nextPageToken":"61AF0C190D6BD629","prevPageToken":"3EA621243546C8A5","requestCount":5,"responseCount":5,"totalResults":5}
     * time : 2017-04-11 19:12:54
     */

    private int code;
    private String     message;
    private NoticeBean notice;
    private ResultBean result;
    private String     time;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public NoticeBean getNotice() {
        return notice;
    }

    public void setNotice(NoticeBean notice) {
        this.notice = notice;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public static class NoticeBean {
        /**
         * like : 0
         * review : 6
         * letter : 0
         * mention : 0
         * fans : 1
         */

        private int like;
        private int review;
        private int letter;
        private int mention;
        private int fans;

        public int getLike() {
            return like;
        }

        public void setLike(int like) {
            this.like = like;
        }

        public int getReview() {
            return review;
        }

        public void setReview(int review) {
            this.review = review;
        }

        public int getLetter() {
            return letter;
        }

        public void setLetter(int letter) {
            this.letter = letter;
        }

        public int getMention() {
            return mention;
        }

        public void setMention(int mention) {
            this.mention = mention;
        }

        public int getFans() {
            return fans;
        }

        public void setFans(int fans) {
            this.fans = fans;
        }
    }

    public static class ResultBean {
        /**
         * items : [{"detail":"","href":"https://www.oschina.net/news/83188/2017-april-yuanchuanghui","id":83188,"img":"https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_0544a761-285d-454a-b9ad-dc08e14cc55b.jpg","name":"源创会 | 武汉、长沙开始报名啦！","pubDate":"2017-03-27 14:06:26","type":6},{"detail":"","href":"https://www.oschina.net/question/2720166_2237849","id":2237849,"img":"https://static.oschina.net/uploads/cooperation/75323/ubuntu-forum-black-sql_f58099c5-7c6f-4073-b0bc-870a63eee130.png","name":"高手问答 | 亿级流量网站架构核心技术","pubDate":"2017-04-10 18:07:49","type":2},{"detail":"","href":"https://www.oschina.net/news/83724/tiobe-4-hack-50","id":83724,"img":"https://static.oschina.net/uploads/cooperation/78083/chrome55-save-at-least-35-percent-memory_525a08c6-2833-42da-8b0f-475fa4c2d19c.jpg","name":"TIOBE 4 月编程语言排行榜","pubDate":"2017-04-11 17:49:32","type":6},{"detail":"","href":"https://www.oschina.net/news/83743/ai-replace-programmer","id":83743,"img":"https://static.oschina.net/uploads/cooperation/77929/top-income-programming-languages-2016_d8ffd8e4-5c4a-406a-9774-0219030fac0e.jpg","name":"AI 可以编程了，程序猿们何去何从？","pubDate":"2017-04-11 17:51:23","type":6},{"detail":"","href":"https://www.oschina.net/news/83744/programmer-obstacle","id":83744,"img":"https://static.oschina.net/uploads/cooperation/78455/intellij-idea-2016-3-public-preview_499a8c21-631b-43d3-9c8c-1bf5d80a5563.jpg","name":"软件开发人员的编程障碍","pubDate":"2017-04-11 17:52:59","type":6}]
         * nextPageToken : 61AF0C190D6BD629
         * prevPageToken : 3EA621243546C8A5
         * requestCount : 5
         * responseCount : 5
         * totalResults : 5
         */

        private String nextPageToken;
        private String          prevPageToken;
        private int             requestCount;
        private int             responseCount;
        private int             totalResults;
        private List<ItemsBean> items;

        public String getNextPageToken() {
            return nextPageToken;
        }

        public void setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
        }

        public String getPrevPageToken() {
            return prevPageToken;
        }

        public void setPrevPageToken(String prevPageToken) {
            this.prevPageToken = prevPageToken;
        }

        public int getRequestCount() {
            return requestCount;
        }

        public void setRequestCount(int requestCount) {
            this.requestCount = requestCount;
        }

        public int getResponseCount() {
            return responseCount;
        }

        public void setResponseCount(int responseCount) {
            this.responseCount = responseCount;
        }

        public int getTotalResults() {
            return totalResults;
        }

        public void setTotalResults(int totalResults) {
            this.totalResults = totalResults;
        }

        public List<ItemsBean> getItems() {
            return items;
        }

        public void setItems(List<ItemsBean> items) {
            this.items = items;
        }

        public static class ItemsBean {
            /**
             * detail :
             * href : https://www.oschina.net/news/83188/2017-april-yuanchuanghui
             * id : 83188
             * img : https://static.oschina.net/uploads/cooperation/75410/google-beta-natural-language-api_0544a761-285d-454a-b9ad-dc08e14cc55b.jpg
             * name : 源创会 | 武汉、长沙开始报名啦！
             * pubDate : 2017-03-27 14:06:26
             * type : 6
             */

            private String detail;
            private String href;
            private int    id;
            private String img;
            private String name;
            private String pubDate;
            private int    type;

            public String getDetail() {
                return detail;
            }

            public void setDetail(String detail) {
                this.detail = detail;
            }

            public String getHref() {
                return href;
            }

            public void setHref(String href) {
                this.href = href;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }
        }
    }
}
