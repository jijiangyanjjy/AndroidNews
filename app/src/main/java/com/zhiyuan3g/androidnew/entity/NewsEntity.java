package com.zhiyuan3g.androidnew.entity;

import com.chad.library.adapter.base.entity.MultiItemEntity;

import java.util.List;

/**
 * Created by kkkkk on 2017/9/8.
 */

public class NewsEntity {

    /**
     * reason : 成功的返回
     * result : {"stat":"1","data":[{"uniquekey":"62956f3660da71eb4d3aaf89e09ee871","title":"特朗普会晤科威特领导人 主动搀扶显绅士风度","date":"2017-09-08 09:04","category":"头条","author_name":"东方IC","url":"http://mini.eastday.com/mobile/170908090458347.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_4_mwpm_03200403.jpg"},{"uniquekey":"0f53c1b3bf728ad5b64a75709298452f","title":"韩越副防长在首尔会面 磋商安保合作方案","date":"2017-09-08 10:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908101616699.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170908/20170908101616_36a4ec9488f6e85149ecbd7a557fc10e_1_mwpm_03200403.jpg"},{"uniquekey":"ce59109a9a71c13608d24b67f02104ed","title":"中科院get一项新科技可望治蝗灾：关闭蝗虫体内\u201c集结令\u201d","date":"2017-09-08 10:09","category":"头条","author_name":"四川日报","url":"http://mini.eastday.com/mobile/170908100919009.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170908/20170908100919_dccfad4d0d0374d22a765757206e70fc_1_mwpm_03200403.jpg"},{"uniquekey":"18c0b4126529c4b444923dde6f258600","title":"全港震怒！香港高校闹\u201c港独\u201d最没人性的一幕出现了","date":"2017-09-08 09:56","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170908095637374.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170908/20170908095637_93c2fce8c092e584cb3380784d1aaccb_1_mwpm_03200403.jpg"},{"uniquekey":"35fb05360fa8c08fa7dbc2dd939385bf","title":"开盘：两市低开沪指跌0.03% 高送转次新股领跌","date":"2017-09-08 09:37","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170908093731955.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170908/20170908093731_e87602d081999293c3c950d91bcb778a_1_mwpm_03200403.jpg"},{"uniquekey":"1b031ec96a0f52a9d2e3b00293a2159e","title":"飓风\u201c艾玛\u201d已致8人丧生 法属岛屿遭受重创","date":"2017-09-08 09:25","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908092521166.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908092521_0b2bb9d1319695703d635ad3476b9dbc_1_mwpm_03200403.jpg"},{"uniquekey":"d6d1297b750d48399e1f559218512ef4","title":"深圳拟开展\"以房养老\"保险试点 资金直补鼓励发展","date":"2017-09-08 09:19","category":"头条","author_name":"南方网","url":"http://mini.eastday.com/mobile/170908091948042.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170908/20170908091948_8d919692af7db92bc5478d495167586d_1_mwpm_03200403.jpg"},{"uniquekey":"af7c9fd943cb4175bf1325a7342ff9aa","title":"\u201c艾尔玛\u201d向美国推进，德专家：气候变化让超强飓风成新常态","date":"2017-09-08 09:19","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170908091943230.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170908/20170908091943_fba34c4c8d25f8843da8964b58545507_1_mwpm_03200403.jpg"},{"uniquekey":"f71cc7fb7b7cba9f39005ce4bafca977","title":"克宫：俄日之间没有签署和平协议的期限","date":"2017-09-08 09:15","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908091511836.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170908/20170908091511_a4ab77c7c1abe95aa0b1ac977384e91e_1_mwpm_03200403.jpg"},{"uniquekey":"24883037f6cc08c54c2b896a2662f34a","title":"日本唐招提寺将向扬州大明寺赠送汉诗刺绣袈裟","date":"2017-09-08 09:15","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908091510929.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170908/20170908091510_253329aa6390edd51d71d38495bf8322_1_mwpm_03200403.jpg"},{"uniquekey":"fe8fa2050d3bf3dd168c935c9943c579","title":"广东滨海公路最快年底开建 串联14地市90景点","date":"2017-09-08 09:09","category":"头条","author_name":"南都","url":"http://mini.eastday.com/mobile/170908090946648.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170908/20170908090946_535e5f68fbab56d52ae701deab06b4b8_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170908/20170908090946_535e5f68fbab56d52ae701deab06b4b8_2_mwpm_03200403.jpg"},{"uniquekey":"cf8cbe5053971bd4bf7f4732ccc81433","title":"法国一日发现两处民宅藏炸药 或与西班牙恐袭有关","date":"2017-09-08 09:04","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908090457479.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170908/20170908090457_2306e800142a714413e0dc9db29dd4fb_1_mwpm_03200403.jpg"},{"uniquekey":"1d8f7c692b8ca557e855283a05ebdb5b","title":"墨西哥驱逐朝鲜大使 限其72小时内离开","date":"2017-09-08 08:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908084847059.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908084847_9280420d316ba12bac19b0174c0a7d5a_1_mwpm_03200403.jpg"},{"uniquekey":"fcfb93bb1b5db8fe8e5241ed226d1031","title":"中国不声不响又造出来一个大东西 美专家对此忧心忡忡","date":"2017-09-08 08:47","category":"头条","author_name":"军谈天下事","url":"http://mini.eastday.com/mobile/170908084702243.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908_744fdc1e8c31d9b28ca9d9201ba8c5be_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170908/20170908_9d8eea3a79341e445a660a839c4be88e_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170908/20170908_c32cfdd1ae05cd9f0452ecf0d0e09310_cover_mwpm_03200403.jpg"},{"uniquekey":"0133d5ee53ed39d57038060b2a93c222","title":"俄媒：俄将兴建更大船坞 可建11万吨级航母","date":"2017-09-08 08:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908084433314.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170908/20170908084433_1f45fc5d05f20fe90e9dd4b03647fd5c_1_mwpm_03200403.jpg"},{"uniquekey":"22ad82a9da72cb3db8aa9f1ac4f6bcba","title":"美媒:美军舰难拦截反舰弹道导弹 海洋变得危险","date":"2017-09-08 08:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908084433114.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908084433_afd546a317646443a78f70f1f69c28df_1_mwpm_03200403.jpg"},{"uniquekey":"78b8b55b0ada2785dc56855b6e107b77","title":"全球最大上市对冲基金获中国私募证券投资基金牌照","date":"2017-09-08 08:40","category":"头条","author_name":"新浪财经","url":"http://mini.eastday.com/mobile/170908084037972.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908084037_850c711cb72173ecd746cf909c62d4da_1_mwpm_03200403.jpg"},{"uniquekey":"55b4b31f3cbd8ac1d990aa9f97a70a96","title":"众明星关注产妇剧痛跳楼身亡事件 谴责产妇家属","date":"2017-09-08 08:39","category":"头条","author_name":"女生私房话","url":"http://mini.eastday.com/mobile/170908083912391.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170908/20170908083912_c15f0f62f0d8c7f60e719b6c0de5ac8e_1_mwpm_03200403.jpeg"},{"uniquekey":"bf514557dbbaa8223e8ce9483cb211a2","title":"好消息！今年下半年农村将迎来三件大事，却为何还是有人不满意？","date":"2017-09-08 08:28","category":"头条","author_name":"老杨说三农","url":"http://mini.eastday.com/mobile/170908082818508.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908082818_b3b1d5ca139f008581e97cd0ceb77e45_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170908/20170908082818_b3b1d5ca139f008581e97cd0ceb77e45_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170908/20170908082818_b3b1d5ca139f008581e97cd0ceb77e45_3_mwpm_03200403.jpg"},{"uniquekey":"f37a59843aecfcfb6f1687c748d11fa0","title":"印军高官鼓吹与中巴两线作战 意为陆军争资源","date":"2017-09-08 08:25","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908082536413.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908082536_ea2c6a3f3df0cc4dd6800d0cbf169edb_1_mwpm_03200403.jpg"},{"uniquekey":"f0be0a3ad62cb6dac60b80e109c3e4cb","title":"文在寅结束俄罗斯之行回国 韩媒：外交成果显著","date":"2017-09-08 08:24","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908082410688.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170908/20170908082410_dcb38349996ec878740a3b8cf3a09674_1_mwpm_03200403.jpg"},{"uniquekey":"b9d73c937d97d0b2b8ae8923100b7bca","title":"班农离职后首次接受电视采访：我是一名街头斗士，将继续支持特朗普","date":"2017-09-08 08:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908081402413.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908081402_7d96af28d667c5b9795719b264f44cc0_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170908/20170908081402_7d96af28d667c5b9795719b264f44cc0_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170908/20170908081402_7d96af28d667c5b9795719b264f44cc0_3_mwpm_03200403.jpg"},{"uniquekey":"1db7bee0981112109f75bfc0453f03aa","title":"看完你就知道该买谁了 8月手机性能榜单TOP10","date":"2017-09-08 07:58","category":"头条","author_name":"泡泡网","url":"http://mini.eastday.com/mobile/170908075807150.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908075807_ab7069356472732d35bc50680edaf45c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170908/20170908075807_ab7069356472732d35bc50680edaf45c_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170908/20170908075807_ab7069356472732d35bc50680edaf45c_3_mwpm_03200403.jpg"},{"uniquekey":"15124e9024cf6dab722c0f1e4c6b85f5","title":"这早餐饼非常省事，不用揉面，做法绝对详细，一看就懂！","date":"2017-09-08 07:48","category":"头条","author_name":"面时代优美食生活指南","url":"http://mini.eastday.com/mobile/170908074858958.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908074858_1eee97b56a98688ee5d4ffb9cca64880_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170908/20170908074858_1eee97b56a98688ee5d4ffb9cca64880_12_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170908/20170908074858_1eee97b56a98688ee5d4ffb9cca64880_2_mwpm_03200403.jpg"},{"uniquekey":"438e2350a07a11a6eba56aee9826594d","title":"下面这5种食物，甩肉的效果妥妥的","date":"2017-09-08 07:48","category":"头条","author_name":"宝宝成长之路","url":"http://mini.eastday.com/mobile/170908074857318.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908074857_1048fe0e09b6d0b6a4598f5ec03babcf_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170908/20170908074857_1048fe0e09b6d0b6a4598f5ec03babcf_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170908/20170908074857_1048fe0e09b6d0b6a4598f5ec03babcf_3_mwpm_03200403.jpg"},{"uniquekey":"ef909b00645fd8ab70d1f1aafba1f6ff","title":"练了这么多年腹肌，今天我才知道练腹肌原来不用做仰卧起坐","date":"2017-09-08 07:48","category":"头条","author_name":"潮流健身吧","url":"http://mini.eastday.com/mobile/170908074851378.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908074851_cd30805bdd8f732b88eadd2986a6181f_10_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170908/20170908074851_cd30805bdd8f732b88eadd2986a6181f_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170908/20170908074851_cd30805bdd8f732b88eadd2986a6181f_8_mwpm_03200403.jpg"},{"uniquekey":"089ceacecede9151394a1799b634391c","title":"飓风\u201c艾尔玛\u201d横扫法属小岛损失严重 如世界末日","date":"2017-09-08 07:43","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170908074327824.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170908/20170908074327_8fb93e2ff3e427484623404e7ffaebbe_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170908/20170908074327_8fb93e2ff3e427484623404e7ffaebbe_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170908/20170908074327_8fb93e2ff3e427484623404e7ffaebbe_2_mwpm_03200403.jpg"},{"uniquekey":"6272f880f4047cb69442c62311b16b37","title":"日本前参议员猪木再访朝鲜 朝媒称是非官方访问","date":"2017-09-08 07:38","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170908073805164.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908073805_3d03ec3170a9e6d359340bbcb198c4aa_1_mwpm_03200403.jpg"},{"uniquekey":"3eee32e269a21c4a2d3bab80fc79cdb8","title":"大宗商品市场将进入\u201c慢牛\u201d状态","date":"2017-09-08 07:33","category":"头条","author_name":"上海证券报","url":"http://mini.eastday.com/mobile/170908073344646.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908073344_aecfbfd292f866a183c5f044eb1dee62_1_mwpm_03200403.jpg"},{"uniquekey":"00d546f3f8570c96970a15b7a0bdcd18","title":"鞍山一女士违章被交警拦 上前给了交警一耳光","date":"2017-09-08 07:33","category":"头条","author_name":"二三里","url":"http://mini.eastday.com/mobile/170908073323769.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170908/20170908073323_7334b461c80bcdee4e842aa973603be3_1_mwpm_03200403.jpg"}]}
     * error_code : 0
     */

    private String reason;
    private ResultBean result;
    private int error_code;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public static class ResultBean {
        /**
         * stat : 1
         * data : [{"uniquekey":"62956f3660da71eb4d3aaf89e09ee871","title":"特朗普会晤科威特领导人 主动搀扶显绅士风度","date":"2017-09-08 09:04","category":"头条","author_name":"东方IC","url":"http://mini.eastday.com/mobile/170908090458347.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_3_mwpm_03200403.jpg","thumbnail_pic_s03":"http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_4_mwpm_03200403.jpg"},{"uniquekey":"0f53c1b3bf728ad5b64a75709298452f","title":"韩越副防长在首尔会面 磋商安保合作方案","date":"2017-09-08 10:16","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908101616699.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170908/20170908101616_36a4ec9488f6e85149ecbd7a557fc10e_1_mwpm_03200403.jpg"},{"uniquekey":"ce59109a9a71c13608d24b67f02104ed","title":"中科院get一项新科技可望治蝗灾：关闭蝗虫体内\u201c集结令\u201d","date":"2017-09-08 10:09","category":"头条","author_name":"四川日报","url":"http://mini.eastday.com/mobile/170908100919009.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170908/20170908100919_dccfad4d0d0374d22a765757206e70fc_1_mwpm_03200403.jpg"},{"uniquekey":"18c0b4126529c4b444923dde6f258600","title":"全港震怒！香港高校闹\u201c港独\u201d最没人性的一幕出现了","date":"2017-09-08 09:56","category":"头条","author_name":"环球时报","url":"http://mini.eastday.com/mobile/170908095637374.html","thumbnail_pic_s":"http://03.imgmini.eastday.com/mobile/20170908/20170908095637_93c2fce8c092e584cb3380784d1aaccb_1_mwpm_03200403.jpg"},{"uniquekey":"35fb05360fa8c08fa7dbc2dd939385bf","title":"开盘：两市低开沪指跌0.03% 高送转次新股领跌","date":"2017-09-08 09:37","category":"头条","author_name":"新华网","url":"http://mini.eastday.com/mobile/170908093731955.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170908/20170908093731_e87602d081999293c3c950d91bcb778a_1_mwpm_03200403.jpg"},{"uniquekey":"1b031ec96a0f52a9d2e3b00293a2159e","title":"飓风\u201c艾玛\u201d已致8人丧生 法属岛屿遭受重创","date":"2017-09-08 09:25","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908092521166.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908092521_0b2bb9d1319695703d635ad3476b9dbc_1_mwpm_03200403.jpg"},{"uniquekey":"d6d1297b750d48399e1f559218512ef4","title":"深圳拟开展\"以房养老\"保险试点 资金直补鼓励发展","date":"2017-09-08 09:19","category":"头条","author_name":"南方网","url":"http://mini.eastday.com/mobile/170908091948042.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170908/20170908091948_8d919692af7db92bc5478d495167586d_1_mwpm_03200403.jpg"},{"uniquekey":"af7c9fd943cb4175bf1325a7342ff9aa","title":"\u201c艾尔玛\u201d向美国推进，德专家：气候变化让超强飓风成新常态","date":"2017-09-08 09:19","category":"头条","author_name":"澎湃新闻网","url":"http://mini.eastday.com/mobile/170908091943230.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170908/20170908091943_fba34c4c8d25f8843da8964b58545507_1_mwpm_03200403.jpg"},{"uniquekey":"f71cc7fb7b7cba9f39005ce4bafca977","title":"克宫：俄日之间没有签署和平协议的期限","date":"2017-09-08 09:15","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908091511836.html","thumbnail_pic_s":"http://04.imgmini.eastday.com/mobile/20170908/20170908091511_a4ab77c7c1abe95aa0b1ac977384e91e_1_mwpm_03200403.jpg"},{"uniquekey":"24883037f6cc08c54c2b896a2662f34a","title":"日本唐招提寺将向扬州大明寺赠送汉诗刺绣袈裟","date":"2017-09-08 09:15","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908091510929.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170908/20170908091510_253329aa6390edd51d71d38495bf8322_1_mwpm_03200403.jpg"},{"uniquekey":"fe8fa2050d3bf3dd168c935c9943c579","title":"广东滨海公路最快年底开建 串联14地市90景点","date":"2017-09-08 09:09","category":"头条","author_name":"南都","url":"http://mini.eastday.com/mobile/170908090946648.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170908/20170908090946_535e5f68fbab56d52ae701deab06b4b8_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://06.imgmini.eastday.com/mobile/20170908/20170908090946_535e5f68fbab56d52ae701deab06b4b8_2_mwpm_03200403.jpg"},{"uniquekey":"cf8cbe5053971bd4bf7f4732ccc81433","title":"法国一日发现两处民宅藏炸药 或与西班牙恐袭有关","date":"2017-09-08 09:04","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908090457479.html","thumbnail_pic_s":"http://05.imgmini.eastday.com/mobile/20170908/20170908090457_2306e800142a714413e0dc9db29dd4fb_1_mwpm_03200403.jpg"},{"uniquekey":"1d8f7c692b8ca557e855283a05ebdb5b","title":"墨西哥驱逐朝鲜大使 限其72小时内离开","date":"2017-09-08 08:48","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908084847059.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908084847_9280420d316ba12bac19b0174c0a7d5a_1_mwpm_03200403.jpg"},{"uniquekey":"fcfb93bb1b5db8fe8e5241ed226d1031","title":"中国不声不响又造出来一个大东西 美专家对此忧心忡忡","date":"2017-09-08 08:47","category":"头条","author_name":"军谈天下事","url":"http://mini.eastday.com/mobile/170908084702243.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908_744fdc1e8c31d9b28ca9d9201ba8c5be_cover_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170908/20170908_9d8eea3a79341e445a660a839c4be88e_cover_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170908/20170908_c32cfdd1ae05cd9f0452ecf0d0e09310_cover_mwpm_03200403.jpg"},{"uniquekey":"0133d5ee53ed39d57038060b2a93c222","title":"俄媒：俄将兴建更大船坞 可建11万吨级航母","date":"2017-09-08 08:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908084433314.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170908/20170908084433_1f45fc5d05f20fe90e9dd4b03647fd5c_1_mwpm_03200403.jpg"},{"uniquekey":"22ad82a9da72cb3db8aa9f1ac4f6bcba","title":"美媒:美军舰难拦截反舰弹道导弹 海洋变得危险","date":"2017-09-08 08:44","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908084433114.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908084433_afd546a317646443a78f70f1f69c28df_1_mwpm_03200403.jpg"},{"uniquekey":"78b8b55b0ada2785dc56855b6e107b77","title":"全球最大上市对冲基金获中国私募证券投资基金牌照","date":"2017-09-08 08:40","category":"头条","author_name":"新浪财经","url":"http://mini.eastday.com/mobile/170908084037972.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908084037_850c711cb72173ecd746cf909c62d4da_1_mwpm_03200403.jpg"},{"uniquekey":"55b4b31f3cbd8ac1d990aa9f97a70a96","title":"众明星关注产妇剧痛跳楼身亡事件 谴责产妇家属","date":"2017-09-08 08:39","category":"头条","author_name":"女生私房话","url":"http://mini.eastday.com/mobile/170908083912391.html","thumbnail_pic_s":"http://09.imgmini.eastday.com/mobile/20170908/20170908083912_c15f0f62f0d8c7f60e719b6c0de5ac8e_1_mwpm_03200403.jpeg"},{"uniquekey":"bf514557dbbaa8223e8ce9483cb211a2","title":"好消息！今年下半年农村将迎来三件大事，却为何还是有人不满意？","date":"2017-09-08 08:28","category":"头条","author_name":"老杨说三农","url":"http://mini.eastday.com/mobile/170908082818508.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908082818_b3b1d5ca139f008581e97cd0ceb77e45_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170908/20170908082818_b3b1d5ca139f008581e97cd0ceb77e45_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170908/20170908082818_b3b1d5ca139f008581e97cd0ceb77e45_3_mwpm_03200403.jpg"},{"uniquekey":"f37a59843aecfcfb6f1687c748d11fa0","title":"印军高官鼓吹与中巴两线作战 意为陆军争资源","date":"2017-09-08 08:25","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908082536413.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908082536_ea2c6a3f3df0cc4dd6800d0cbf169edb_1_mwpm_03200403.jpg"},{"uniquekey":"f0be0a3ad62cb6dac60b80e109c3e4cb","title":"文在寅结束俄罗斯之行回国 韩媒：外交成果显著","date":"2017-09-08 08:24","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908082410688.html","thumbnail_pic_s":"http://06.imgmini.eastday.com/mobile/20170908/20170908082410_dcb38349996ec878740a3b8cf3a09674_1_mwpm_03200403.jpg"},{"uniquekey":"b9d73c937d97d0b2b8ae8923100b7bca","title":"班农离职后首次接受电视采访：我是一名街头斗士，将继续支持特朗普","date":"2017-09-08 08:14","category":"头条","author_name":"环球网","url":"http://mini.eastday.com/mobile/170908081402413.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908081402_7d96af28d667c5b9795719b264f44cc0_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170908/20170908081402_7d96af28d667c5b9795719b264f44cc0_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170908/20170908081402_7d96af28d667c5b9795719b264f44cc0_3_mwpm_03200403.jpg"},{"uniquekey":"1db7bee0981112109f75bfc0453f03aa","title":"看完你就知道该买谁了 8月手机性能榜单TOP10","date":"2017-09-08 07:58","category":"头条","author_name":"泡泡网","url":"http://mini.eastday.com/mobile/170908075807150.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908075807_ab7069356472732d35bc50680edaf45c_1_mwpm_03200403.jpg","thumbnail_pic_s02":"http://01.imgmini.eastday.com/mobile/20170908/20170908075807_ab7069356472732d35bc50680edaf45c_2_mwpm_03200403.jpg","thumbnail_pic_s03":"http://01.imgmini.eastday.com/mobile/20170908/20170908075807_ab7069356472732d35bc50680edaf45c_3_mwpm_03200403.jpg"},{"uniquekey":"15124e9024cf6dab722c0f1e4c6b85f5","title":"这早餐饼非常省事，不用揉面，做法绝对详细，一看就懂！","date":"2017-09-08 07:48","category":"头条","author_name":"面时代优美食生活指南","url":"http://mini.eastday.com/mobile/170908074858958.html","thumbnail_pic_s":"http://08.imgmini.eastday.com/mobile/20170908/20170908074858_1eee97b56a98688ee5d4ffb9cca64880_13_mwpm_03200403.jpg","thumbnail_pic_s02":"http://08.imgmini.eastday.com/mobile/20170908/20170908074858_1eee97b56a98688ee5d4ffb9cca64880_12_mwpm_03200403.jpg","thumbnail_pic_s03":"http://08.imgmini.eastday.com/mobile/20170908/20170908074858_1eee97b56a98688ee5d4ffb9cca64880_2_mwpm_03200403.jpg"},{"uniquekey":"438e2350a07a11a6eba56aee9826594d","title":"下面这5种食物，甩肉的效果妥妥的","date":"2017-09-08 07:48","category":"头条","author_name":"宝宝成长之路","url":"http://mini.eastday.com/mobile/170908074857318.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908074857_1048fe0e09b6d0b6a4598f5ec03babcf_2_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170908/20170908074857_1048fe0e09b6d0b6a4598f5ec03babcf_5_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170908/20170908074857_1048fe0e09b6d0b6a4598f5ec03babcf_3_mwpm_03200403.jpg"},{"uniquekey":"ef909b00645fd8ab70d1f1aafba1f6ff","title":"练了这么多年腹肌，今天我才知道练腹肌原来不用做仰卧起坐","date":"2017-09-08 07:48","category":"头条","author_name":"潮流健身吧","url":"http://mini.eastday.com/mobile/170908074851378.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908074851_cd30805bdd8f732b88eadd2986a6181f_10_mwpm_03200403.jpg","thumbnail_pic_s02":"http://07.imgmini.eastday.com/mobile/20170908/20170908074851_cd30805bdd8f732b88eadd2986a6181f_4_mwpm_03200403.jpg","thumbnail_pic_s03":"http://07.imgmini.eastday.com/mobile/20170908/20170908074851_cd30805bdd8f732b88eadd2986a6181f_8_mwpm_03200403.jpg"},{"uniquekey":"089ceacecede9151394a1799b634391c","title":"飓风\u201c艾尔玛\u201d横扫法属小岛损失严重 如世界末日","date":"2017-09-08 07:43","category":"头条","author_name":"中国新闻网","url":"http://mini.eastday.com/mobile/170908074327824.html","thumbnail_pic_s":"http://02.imgmini.eastday.com/mobile/20170908/20170908074327_8fb93e2ff3e427484623404e7ffaebbe_3_mwpm_03200403.jpg","thumbnail_pic_s02":"http://02.imgmini.eastday.com/mobile/20170908/20170908074327_8fb93e2ff3e427484623404e7ffaebbe_1_mwpm_03200403.jpg","thumbnail_pic_s03":"http://02.imgmini.eastday.com/mobile/20170908/20170908074327_8fb93e2ff3e427484623404e7ffaebbe_2_mwpm_03200403.jpg"},{"uniquekey":"6272f880f4047cb69442c62311b16b37","title":"日本前参议员猪木再访朝鲜 朝媒称是非官方访问","date":"2017-09-08 07:38","category":"头条","author_name":"央视网","url":"http://mini.eastday.com/mobile/170908073805164.html","thumbnail_pic_s":"http://01.imgmini.eastday.com/mobile/20170908/20170908073805_3d03ec3170a9e6d359340bbcb198c4aa_1_mwpm_03200403.jpg"},{"uniquekey":"3eee32e269a21c4a2d3bab80fc79cdb8","title":"大宗商品市场将进入\u201c慢牛\u201d状态","date":"2017-09-08 07:33","category":"头条","author_name":"上海证券报","url":"http://mini.eastday.com/mobile/170908073344646.html","thumbnail_pic_s":"http://07.imgmini.eastday.com/mobile/20170908/20170908073344_aecfbfd292f866a183c5f044eb1dee62_1_mwpm_03200403.jpg"},{"uniquekey":"00d546f3f8570c96970a15b7a0bdcd18","title":"鞍山一女士违章被交警拦 上前给了交警一耳光","date":"2017-09-08 07:33","category":"头条","author_name":"二三里","url":"http://mini.eastday.com/mobile/170908073323769.html","thumbnail_pic_s":"http://00.imgmini.eastday.com/mobile/20170908/20170908073323_7334b461c80bcdee4e842aa973603be3_1_mwpm_03200403.jpg"}]
         */

        private String stat;
        private List<DataBean> data;

        public String getStat() {
            return stat;
        }

        public void setStat(String stat) {
            this.stat = stat;
        }

        public List<DataBean> getData() {
            return data;
        }

        public void setData(List<DataBean> data) {
            this.data = data;
        }

        public static class DataBean implements MultiItemEntity{
            public static final int ONE = 1;
            public static final int TWO = 2;
            public static final int THREE = 3;
            private int itemType;

            public void setItemType(int itemType) {
                this.itemType = itemType;
            }

            @Override
            public int getItemType() {
                return itemType;
            }

            /**
             * uniquekey : 62956f3660da71eb4d3aaf89e09ee871
             * title : 特朗普会晤科威特领导人 主动搀扶显绅士风度
             * date : 2017-09-08 09:04
             * category : 头条
             * author_name : 东方IC
             * url : http://mini.eastday.com/mobile/170908090458347.html
             * thumbnail_pic_s : http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_2_mwpm_03200403.jpg
             * thumbnail_pic_s02 : http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_3_mwpm_03200403.jpg
             * thumbnail_pic_s03 : http://00.imgmini.eastday.com/mobile/20170908/20170908090458_f6976f815caf09cfe8d6f673266ea080_4_mwpm_03200403.jpg
             */

            private String uniquekey;
            private String title;
            private String date;
            private String category;
            private String author_name;
            private String url;
            private String thumbnail_pic_s;
            private String thumbnail_pic_s02;
            private String thumbnail_pic_s03;

            public String getUniquekey() {
                return uniquekey;
            }

            public void setUniquekey(String uniquekey) {
                this.uniquekey = uniquekey;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getCategory() {
                return category;
            }

            public void setCategory(String category) {
                this.category = category;
            }

            public String getAuthor_name() {
                return author_name;
            }

            public void setAuthor_name(String author_name) {
                this.author_name = author_name;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getThumbnail_pic_s() {
                return thumbnail_pic_s;
            }

            public void setThumbnail_pic_s(String thumbnail_pic_s) {
                this.thumbnail_pic_s = thumbnail_pic_s;
            }

            public String getThumbnail_pic_s02() {
                return thumbnail_pic_s02;
            }

            public void setThumbnail_pic_s02(String thumbnail_pic_s02) {
                this.thumbnail_pic_s02 = thumbnail_pic_s02;
            }

            public String getThumbnail_pic_s03() {
                return thumbnail_pic_s03;
            }

            public void setThumbnail_pic_s03(String thumbnail_pic_s03) {
                this.thumbnail_pic_s03 = thumbnail_pic_s03;
            }
        }
    }
}
