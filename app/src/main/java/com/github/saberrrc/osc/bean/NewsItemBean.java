package com.github.saberrrc.osc.bean;

import java.util.List;

public class NewsItemBean {

    /**
     * code : 1
     * message : success
     * notice : {"like":0,"review":6,"letter":0,"mention":0,"fans":1}
     * result : {"items":[{"author":"两味真火","body":"Mozilla 公布了最新的开源支持计划(Mozilla Open Source Support)资助项目，共资助 36.5 万美元。 获得资助的开源项目包括：匿名报料平台 SecureD...","commentCount":1,"href":"https://www.oschina.net/news/83761/mozilla-funded-365,000-open-source-projects","id":83761,"pubDate":"2017-04-11 18:47:16","recommend":true,"title":"Mozilla 向开源项目资助 36.5 万美元","type":6,"viewCount":0},{"author":"两味真火","body":"强哥死了，上地及西二旗最牛逼的程序员停止了思考。 我来的晚了，葬礼已经结束。此时清明刚过，天色阴沉，山坡上正是桃花十里。这位老程序员逝世以...","commentCount":5,"href":"https://www.oschina.net/news/83760/in-front-of-programmer-tomb","id":83760,"pubDate":"2017-04-11 18:32:41","recommend":true,"title":"在一个程序员的墓前","type":6,"viewCount":70},{"author":"布莱特约修亚","body":"最近在网上看到一个有趣的问题：整个互联网的流量中，真人的占比有多少？根据 Aberdeen Group在近期发布的以北美几百家公司数据为样本的爬虫调查报...","commentCount":3,"href":"https://www.oschina.net/news/83759/openwaf-open-source-reptile-module","id":83759,"pubDate":"2017-04-11 17:10:21","recommend":true,"title":"天泰 OpenWAF 开源防爬虫模块","type":6,"viewCount":328},{"author":"kayo5994","body":"QMUI Web 是一个专注 Web UI 开发，帮助开发者快速实现特定的一整套设计的框架。框架主要由一个强大的 SASS 方法合集与内置的工作流构成，由QMUI ...","commentCount":1,"href":"https://www.oschina.net/news/83758/qmui-web-2-0","id":83758,"pubDate":"2017-04-11 16:32:11","recommend":true,"title":"QMUI Web 框架正式发布 2.0 版本","type":6,"viewCount":614},{"author":"两味真火","body":"摘要：近日，安全机构FireEye报告了一个零日漏洞，它存在于微软Word中，一个感染性RTF文件可瞬间致使Windows系统瘫痪。按照FireEye说法，微软已经和...","commentCount":24,"href":"https://www.oschina.net/news/83755/word-0-day","id":83755,"pubDate":"2017-04-11 12:06:56","recommend":true,"title":"Word 现零日漏洞 瞬间瘫痪 Windows 系统","type":6,"viewCount":2363},{"author":"Eriloan","body":"WebConsole 是基于 Golang、WebSocket、xTermJS 的远程 SSH 远程终端工具。 WebConsole 1.4.6 更新日志：         1、添加对 JSONP 的支持，解...","commentCount":1,"href":"https://www.oschina.net/news/83754/webconsole-1-4-6","id":83754,"pubDate":"2017-04-11 11:42:15","recommend":false,"title":"WebConsole 1.4.6 发布，Web SSH 远程终端","type":6,"viewCount":1247},{"author":"lyunweb","body":"基于lyicon v0.0.2，现增加一些新图标，如图标库未能满足大家的需求，可以去github给我们一个star并且留下宝贵的建议，我们会认真考虑您的建议。 ...","commentCount":7,"href":"https://www.oschina.net/news/83753/lyicon-0-0-3","id":83753,"pubDate":"2017-04-11 10:57:00","recommend":false,"title":"lyicon（零云icon） 0.03 正式版发布，开源图标库","type":6,"viewCount":1293},{"author":"罗格林","body":"ActFramework 1.1.0 #142 在开发模式生成 pid 文件 #141 支持 URL 上下文路径 #140 Bug： 在一个 Job 方法上不能有两个或以上 Job 调度注解 #139 支...","commentCount":6,"href":"https://www.oschina.net/news/83752/actframework-1-1-0","id":83752,"pubDate":"2017-04-11 10:00:57","recommend":false,"title":"ActFramework 1.1.0 发布，更新数据库插件框架","type":6,"viewCount":594},{"author":"两味真火","body":"现场写下 2017 年心愿，将随机挑选5 个有趣的心愿便利贴，送许愿的 OSCer 2017 新版无 bug 开源内裤。","commentCount":0,"href":"https://www.oschina.net/news/83188/2017-april-yuanchuanghui","id":83751,"pubDate":"2017-04-11 08:24:29","recommend":false,"title":"本周末武汉&长沙源创会，写心愿拿无 bug 开源内裤！","type":0,"viewCount":11},{"author":"两味真火","body":"OSCHINA 本期高手问答（2017 年 4 月 11 日 \u2014 4 月 17 日）我们请来了 @zhangkaitao （张开涛）为大家解答关于亿级流量网站架构核心技术方面...","commentCount":46,"href":"https://www.oschina.net/question/2720166_2237849","id":2237849,"pubDate":"2017-04-11 08:21:17","recommend":false,"title":"高手问答 | 亿级流量网站架构核心技术","type":2,"viewCount":3836},{"author":"两味真火","body":"本文为 Java 开发者们总结了这八个工具，它们几乎涵盖了Java开发的全部范围，从代码构建到错误压缩。这些工具可以帮助您提高代码的质量，并成为更高...","commentCount":14,"href":"https://my.oschina.net/editorial-story/blog/876344","id":876344,"pubDate":"2017-04-11 08:20:09","recommend":false,"title":"从代码构建到性能分析，高效 Java 开发人员的首选工具","type":3,"viewCount":3149},{"author":"两味真火","body":"现在越来越多的互联网公司还是将自己公司的项目进行服务化，这确实是今后项目开发的一个趋势，就这个点再凭借之前的SSM项目来让第一次接触的同学能...","commentCount":6,"href":"https://my.oschina.net/crossoverjie/blog/875150","id":875150,"pubDate":"2017-04-11 08:18:53","recommend":false,"title":"每日一博 | SSM(十一) 基于 dubbo 的分布式架构","type":3,"viewCount":2474},{"author":"两味真火","body":"STF（or Smartphone Test Farm）是一个 Web 应用程序，用于从舒适的浏览器远程调试智能手机，智能手表和其他小工具。","commentCount":2,"href":"https://www.oschina.net/p/stf","id":45071,"pubDate":"2017-04-11 08:16:48","recommend":false,"title":"STF \u2014\u2014 从浏览器控制和管理 Android 设备","type":1,"viewCount":701},{"author":"两味真火","body":"osc-3d-contributions 是 git.oschina 现实3D贡献度的Chrome插件。 参考： Isometric Contributions...","commentCount":0,"href":"http://git.oschina.net/cicime/Chrome_extend","id":83746,"pubDate":"2017-04-11 08:15:48","recommend":false,"title":"码云推荐 | Chrome 3D 贡献度插件 osc-3d-contributions","type":0,"viewCount":6},{"author":"两味真火","body":"我名欧阳锋，自三流本科毕业，辗转北上广，后来自主创业，自此已经虚度30几个春秋。五六年前告别打工的生涯，自主创业，在甘肃兰州，接了点私活，注...","commentCount":41,"href":"https://my.oschina.net/xxiaobian/blog/876496","id":876496,"pubDate":"2017-04-11 08:14:36","recommend":false,"title":"OSChina 周二乱弹 \u2014\u2014程序员的大电影《东邪西毒》之外包风云录","type":3,"viewCount":3311},{"author":"两味真火","body":"没有人满意Java开发人员这种已经\u201c竭尽全力\u201d改变世界的速度，每个人都希望代码像消防水管里的水一样能够源源不断地流出来，但没有人愿意提供给开发...","commentCount":5,"href":"https://www.oschina.net/news/83744/programmer-obstacle","id":83744,"pubDate":"2017-04-11 08:13:09","recommend":false,"title":"软件开发人员的编程障碍，你知道多少？","type":6,"viewCount":2336},{"author":"两味真火","body":"\u201c愚蠢的人类，快走开\u2014\u2014我的代码我自己写！\u201d 现在，机器学习系统获得了一种自动编写代码的能力。 这种程序叫做DeepCoder，由剑桥大学和微软公司...","commentCount":36,"href":"https://www.oschina.net/news/83743/ai-replace-programmer","id":83743,"pubDate":"2017-04-11 08:08:55","recommend":false,"title":"AI 可以自己编程了，程序猿们该何去何从？","type":6,"viewCount":2987},{"author":"两味真火","body":"Windows Vista，一个不怎么长寿的操作系统即将要迎来生命的尽头。该系统将在当地时间4月11日开始正式终结，即对该系统的所有支持都将中止。那些还想...","commentCount":15,"href":"https://www.oschina.net/news/83742/microsoft-stop-supporting-windows-vista","id":83742,"pubDate":"2017-04-11 08:04:52","recommend":false,"title":"今天，微软将正式中止对 Windows Vista 的所有支持！","type":6,"viewCount":926},{"author":"达尔文","body":"苹果发布了 iOS 10.3.2 第二个开发者测试版 Beta 2。除了改进性能和修复 bug 外，iOS 10.3.2 重新加入了 32位设备支持。iOS 10.3.2 第一个测试版发...","commentCount":5,"href":"https://www.oschina.net/news/83741/ios-10-3-2-beta-2","id":83741,"pubDate":"2017-04-11 08:02:06","recommend":false,"title":"iOS 10.3.2 Beta 2 重新支持 32 位设备","type":6,"viewCount":1362},{"author":"两味真火","body":"相比同龄人，75 岁的 Bill Hinshaw 过着不同的生活，他的时间一部分给了家庭\u2014\u2014他有 32 个孙辈和重孙辈\u2014\u2014另一部分则是帮助美国金融企业避免严重...","commentCount":5,"href":"https://www.oschina.net/news/83740/cobol-programmer-popular","id":83740,"pubDate":"2017-04-11 07:58:39","recommend":false,"title":"COBOL 程序员年事已高 但依旧抢手","type":6,"viewCount":1102}],"nextPageToken":"DBA816934CD0AA59","prevPageToken":"0997C855C600E421","requestCount":20,"responseCount":20,"totalResults":77008}
     * time : 2017-04-11 19:15:09
     */

    private int        code;
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
         * items : [{"author":"两味真火","body":"Mozilla 公布了最新的开源支持计划(Mozilla Open Source Support)资助项目，共资助 36.5 万美元。 获得资助的开源项目包括：匿名报料平台 SecureD...","commentCount":1,"href":"https://www.oschina.net/news/83761/mozilla-funded-365,000-open-source-projects","id":83761,"pubDate":"2017-04-11 18:47:16","recommend":true,"title":"Mozilla 向开源项目资助 36.5 万美元","type":6,"viewCount":0},{"author":"两味真火","body":"强哥死了，上地及西二旗最牛逼的程序员停止了思考。 我来的晚了，葬礼已经结束。此时清明刚过，天色阴沉，山坡上正是桃花十里。这位老程序员逝世以...","commentCount":5,"href":"https://www.oschina.net/news/83760/in-front-of-programmer-tomb","id":83760,"pubDate":"2017-04-11 18:32:41","recommend":true,"title":"在一个程序员的墓前","type":6,"viewCount":70},{"author":"布莱特约修亚","body":"最近在网上看到一个有趣的问题：整个互联网的流量中，真人的占比有多少？根据 Aberdeen Group在近期发布的以北美几百家公司数据为样本的爬虫调查报...","commentCount":3,"href":"https://www.oschina.net/news/83759/openwaf-open-source-reptile-module","id":83759,"pubDate":"2017-04-11 17:10:21","recommend":true,"title":"天泰 OpenWAF 开源防爬虫模块","type":6,"viewCount":328},{"author":"kayo5994","body":"QMUI Web 是一个专注 Web UI 开发，帮助开发者快速实现特定的一整套设计的框架。框架主要由一个强大的 SASS 方法合集与内置的工作流构成，由QMUI ...","commentCount":1,"href":"https://www.oschina.net/news/83758/qmui-web-2-0","id":83758,"pubDate":"2017-04-11 16:32:11","recommend":true,"title":"QMUI Web 框架正式发布 2.0 版本","type":6,"viewCount":614},{"author":"两味真火","body":"摘要：近日，安全机构FireEye报告了一个零日漏洞，它存在于微软Word中，一个感染性RTF文件可瞬间致使Windows系统瘫痪。按照FireEye说法，微软已经和...","commentCount":24,"href":"https://www.oschina.net/news/83755/word-0-day","id":83755,"pubDate":"2017-04-11 12:06:56","recommend":true,"title":"Word 现零日漏洞 瞬间瘫痪 Windows 系统","type":6,"viewCount":2363},{"author":"Eriloan","body":"WebConsole 是基于 Golang、WebSocket、xTermJS 的远程 SSH 远程终端工具。 WebConsole 1.4.6 更新日志：         1、添加对 JSONP 的支持，解...","commentCount":1,"href":"https://www.oschina.net/news/83754/webconsole-1-4-6","id":83754,"pubDate":"2017-04-11 11:42:15","recommend":false,"title":"WebConsole 1.4.6 发布，Web SSH 远程终端","type":6,"viewCount":1247},{"author":"lyunweb","body":"基于lyicon v0.0.2，现增加一些新图标，如图标库未能满足大家的需求，可以去github给我们一个star并且留下宝贵的建议，我们会认真考虑您的建议。 ...","commentCount":7,"href":"https://www.oschina.net/news/83753/lyicon-0-0-3","id":83753,"pubDate":"2017-04-11 10:57:00","recommend":false,"title":"lyicon（零云icon） 0.03 正式版发布，开源图标库","type":6,"viewCount":1293},{"author":"罗格林","body":"ActFramework 1.1.0 #142 在开发模式生成 pid 文件 #141 支持 URL 上下文路径 #140 Bug： 在一个 Job 方法上不能有两个或以上 Job 调度注解 #139 支...","commentCount":6,"href":"https://www.oschina.net/news/83752/actframework-1-1-0","id":83752,"pubDate":"2017-04-11 10:00:57","recommend":false,"title":"ActFramework 1.1.0 发布，更新数据库插件框架","type":6,"viewCount":594},{"author":"两味真火","body":"现场写下 2017 年心愿，将随机挑选5 个有趣的心愿便利贴，送许愿的 OSCer 2017 新版无 bug 开源内裤。","commentCount":0,"href":"https://www.oschina.net/news/83188/2017-april-yuanchuanghui","id":83751,"pubDate":"2017-04-11 08:24:29","recommend":false,"title":"本周末武汉&长沙源创会，写心愿拿无 bug 开源内裤！","type":0,"viewCount":11},{"author":"两味真火","body":"OSCHINA 本期高手问答（2017 年 4 月 11 日 \u2014 4 月 17 日）我们请来了 @zhangkaitao （张开涛）为大家解答关于亿级流量网站架构核心技术方面...","commentCount":46,"href":"https://www.oschina.net/question/2720166_2237849","id":2237849,"pubDate":"2017-04-11 08:21:17","recommend":false,"title":"高手问答 | 亿级流量网站架构核心技术","type":2,"viewCount":3836},{"author":"两味真火","body":"本文为 Java 开发者们总结了这八个工具，它们几乎涵盖了Java开发的全部范围，从代码构建到错误压缩。这些工具可以帮助您提高代码的质量，并成为更高...","commentCount":14,"href":"https://my.oschina.net/editorial-story/blog/876344","id":876344,"pubDate":"2017-04-11 08:20:09","recommend":false,"title":"从代码构建到性能分析，高效 Java 开发人员的首选工具","type":3,"viewCount":3149},{"author":"两味真火","body":"现在越来越多的互联网公司还是将自己公司的项目进行服务化，这确实是今后项目开发的一个趋势，就这个点再凭借之前的SSM项目来让第一次接触的同学能...","commentCount":6,"href":"https://my.oschina.net/crossoverjie/blog/875150","id":875150,"pubDate":"2017-04-11 08:18:53","recommend":false,"title":"每日一博 | SSM(十一) 基于 dubbo 的分布式架构","type":3,"viewCount":2474},{"author":"两味真火","body":"STF（or Smartphone Test Farm）是一个 Web 应用程序，用于从舒适的浏览器远程调试智能手机，智能手表和其他小工具。","commentCount":2,"href":"https://www.oschina.net/p/stf","id":45071,"pubDate":"2017-04-11 08:16:48","recommend":false,"title":"STF \u2014\u2014 从浏览器控制和管理 Android 设备","type":1,"viewCount":701},{"author":"两味真火","body":"osc-3d-contributions 是 git.oschina 现实3D贡献度的Chrome插件。 参考： Isometric Contributions...","commentCount":0,"href":"http://git.oschina.net/cicime/Chrome_extend","id":83746,"pubDate":"2017-04-11 08:15:48","recommend":false,"title":"码云推荐 | Chrome 3D 贡献度插件 osc-3d-contributions","type":0,"viewCount":6},{"author":"两味真火","body":"我名欧阳锋，自三流本科毕业，辗转北上广，后来自主创业，自此已经虚度30几个春秋。五六年前告别打工的生涯，自主创业，在甘肃兰州，接了点私活，注...","commentCount":41,"href":"https://my.oschina.net/xxiaobian/blog/876496","id":876496,"pubDate":"2017-04-11 08:14:36","recommend":false,"title":"OSChina 周二乱弹 \u2014\u2014程序员的大电影《东邪西毒》之外包风云录","type":3,"viewCount":3311},{"author":"两味真火","body":"没有人满意Java开发人员这种已经\u201c竭尽全力\u201d改变世界的速度，每个人都希望代码像消防水管里的水一样能够源源不断地流出来，但没有人愿意提供给开发...","commentCount":5,"href":"https://www.oschina.net/news/83744/programmer-obstacle","id":83744,"pubDate":"2017-04-11 08:13:09","recommend":false,"title":"软件开发人员的编程障碍，你知道多少？","type":6,"viewCount":2336},{"author":"两味真火","body":"\u201c愚蠢的人类，快走开\u2014\u2014我的代码我自己写！\u201d 现在，机器学习系统获得了一种自动编写代码的能力。 这种程序叫做DeepCoder，由剑桥大学和微软公司...","commentCount":36,"href":"https://www.oschina.net/news/83743/ai-replace-programmer","id":83743,"pubDate":"2017-04-11 08:08:55","recommend":false,"title":"AI 可以自己编程了，程序猿们该何去何从？","type":6,"viewCount":2987},{"author":"两味真火","body":"Windows Vista，一个不怎么长寿的操作系统即将要迎来生命的尽头。该系统将在当地时间4月11日开始正式终结，即对该系统的所有支持都将中止。那些还想...","commentCount":15,"href":"https://www.oschina.net/news/83742/microsoft-stop-supporting-windows-vista","id":83742,"pubDate":"2017-04-11 08:04:52","recommend":false,"title":"今天，微软将正式中止对 Windows Vista 的所有支持！","type":6,"viewCount":926},{"author":"达尔文","body":"苹果发布了 iOS 10.3.2 第二个开发者测试版 Beta 2。除了改进性能和修复 bug 外，iOS 10.3.2 重新加入了 32位设备支持。iOS 10.3.2 第一个测试版发...","commentCount":5,"href":"https://www.oschina.net/news/83741/ios-10-3-2-beta-2","id":83741,"pubDate":"2017-04-11 08:02:06","recommend":false,"title":"iOS 10.3.2 Beta 2 重新支持 32 位设备","type":6,"viewCount":1362},{"author":"两味真火","body":"相比同龄人，75 岁的 Bill Hinshaw 过着不同的生活，他的时间一部分给了家庭\u2014\u2014他有 32 个孙辈和重孙辈\u2014\u2014另一部分则是帮助美国金融企业避免严重...","commentCount":5,"href":"https://www.oschina.net/news/83740/cobol-programmer-popular","id":83740,"pubDate":"2017-04-11 07:58:39","recommend":false,"title":"COBOL 程序员年事已高 但依旧抢手","type":6,"viewCount":1102}]
         * nextPageToken : DBA816934CD0AA59
         * prevPageToken : 0997C855C600E421
         * requestCount : 20
         * responseCount : 20
         * totalResults : 77008
         */

        private String          nextPageToken;
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
             * author : 两味真火
             * body : Mozilla 公布了最新的开源支持计划(Mozilla Open Source Support)资助项目，共资助 36.5 万美元。 获得资助的开源项目包括：匿名报料平台 SecureD...
             * commentCount : 1
             * href : https://www.oschina.net/news/83761/mozilla-funded-365,000-open-source-projects
             * id : 83761
             * pubDate : 2017-04-11 18:47:16
             * recommend : true
             * title : Mozilla 向开源项目资助 36.5 万美元
             * type : 6
             * viewCount : 0
             */

            private String  author;
            private String  body;
            private int     commentCount;
            private String  href;
            private int     id;
            private String  pubDate;
            private boolean recommend;
            private String  title;
            private int     type;
            private int     viewCount;

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public String getBody() {
                return body;
            }

            public void setBody(String body) {
                this.body = body;
            }

            public int getCommentCount() {
                return commentCount;
            }

            public void setCommentCount(int commentCount) {
                this.commentCount = commentCount;
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

            public String getPubDate() {
                return pubDate;
            }

            public void setPubDate(String pubDate) {
                this.pubDate = pubDate;
            }

            public boolean isRecommend() {
                return recommend;
            }

            public void setRecommend(boolean recommend) {
                this.recommend = recommend;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getViewCount() {
                return viewCount;
            }

            public void setViewCount(int viewCount) {
                this.viewCount = viewCount;
            }
        }
    }
}
