package cn.binarywang.tools.generator;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.RandomUtils;

import cn.binarywang.tools.ChineseCharUtils;

public class ChineseAddressGenerator {
    private static List<String> provinceCityList = new ArrayList<>();

    static {
        provinceCityList.add("黑龙江省齐齐哈尔市");
        provinceCityList.add("黑龙江省黑河市");
        provinceCityList.add("黑龙江省鹤岗市");
        provinceCityList.add("黑龙江省鸡西市");
        provinceCityList.add("黑龙江省绥化市");
        provinceCityList.add("黑龙江省牡丹江市");
        provinceCityList.add("黑龙江省大庆市");
        provinceCityList.add("黑龙江省大兴安岭地区");
        provinceCityList.add("黑龙江省哈尔滨市");
        provinceCityList.add("黑龙江省双鸭山市");
        provinceCityList.add("黑龙江省佳木斯市");
        provinceCityList.add("黑龙江省伊春市");
        provinceCityList.add("黑龙江省七台河市");
        provinceCityList.add("香港特别行政区香港特别行政区");
        provinceCityList.add("青海省黄南藏族自治州");
        provinceCityList.add("青海省西宁市");
        provinceCityList.add("青海省玉树藏族自治州");
        provinceCityList.add("青海省海西蒙古族藏族自治州");
        provinceCityList.add("青海省海南藏族自治州");
        provinceCityList.add("青海省海北藏族自治州");
        provinceCityList.add("青海省海东地区");
        provinceCityList.add("青海省果洛藏族自治州");
        provinceCityList.add("陕西省铜川市");
        provinceCityList.add("陕西省西安市");
        provinceCityList.add("陕西省渭南市");
        provinceCityList.add("陕西省汉中市");
        provinceCityList.add("陕西省榆林市");
        provinceCityList.add("陕西省延安市");
        provinceCityList.add("陕西省宝鸡市");
        provinceCityList.add("陕西省安康市");
        provinceCityList.add("陕西省商洛市");
        provinceCityList.add("陕西省咸阳市");
        provinceCityList.add("重庆市重庆市");
        provinceCityList.add("辽宁省鞍山市");
        provinceCityList.add("辽宁省阜新市");
        provinceCityList.add("辽宁省锦州市");
        provinceCityList.add("辽宁省铁岭市");
        provinceCityList.add("辽宁省辽阳市");
        provinceCityList.add("辽宁省葫芦岛市");
        provinceCityList.add("辽宁省营口市");
        provinceCityList.add("辽宁省盘锦市");
        provinceCityList.add("辽宁省沈阳市");
        provinceCityList.add("辽宁省本溪市");
        provinceCityList.add("辽宁省朝阳市");
        provinceCityList.add("辽宁省抚顺市");
        provinceCityList.add("辽宁省大连市");
        provinceCityList.add("辽宁省丹东市");
        provinceCityList.add("贵州省黔西南布依族苗族自治州");
        provinceCityList.add("贵州省黔南布依族苗族自治州");
        provinceCityList.add("贵州省黔东南苗族侗族自治州");
        provinceCityList.add("贵州省铜仁地区");
        provinceCityList.add("贵州省遵义市");
        provinceCityList.add("贵州省贵阳市");
        provinceCityList.add("贵州省毕节地区");
        provinceCityList.add("贵州省安顺市");
        provinceCityList.add("贵州省六盘水市");
        provinceCityList.add("西藏自治区阿里地区");
        provinceCityList.add("西藏自治区那曲地区");
        provinceCityList.add("西藏自治区林芝地区");
        provinceCityList.add("西藏自治区昌都地区");
        provinceCityList.add("西藏自治区日喀则地区");
        provinceCityList.add("西藏自治区拉萨市");
        provinceCityList.add("西藏自治区山南地区");
        provinceCityList.add("福建省龙岩市");
        provinceCityList.add("福建省莆田市");
        provinceCityList.add("福建省福州市");
        provinceCityList.add("福建省漳州市");
        provinceCityList.add("福建省泉州市");
        provinceCityList.add("福建省宁德市");
        provinceCityList.add("福建省厦门市");
        provinceCityList.add("福建省南平市");
        provinceCityList.add("福建省三明市");
        provinceCityList.add("甘肃省陇南市");
        provinceCityList.add("甘肃省金昌市");
        provinceCityList.add("甘肃省酒泉市");
        provinceCityList.add("甘肃省白银市");
        provinceCityList.add("甘肃省甘南藏族自治州");
        provinceCityList.add("甘肃省武威市");
        provinceCityList.add("甘肃省张掖市");
        provinceCityList.add("甘肃省庆阳市");
        provinceCityList.add("甘肃省平凉市");
        provinceCityList.add("甘肃省定西市");
        provinceCityList.add("甘肃省天水市");
        provinceCityList.add("甘肃省嘉峪关市");
        provinceCityList.add("甘肃省兰州市");
        provinceCityList.add("甘肃省临夏回族自治州");
        provinceCityList.add("澳门特别行政区澳门特别行政区");
        provinceCityList.add("湖南省长沙市");
        provinceCityList.add("湖南省郴州市");
        provinceCityList.add("湖南省邵阳市");
        provinceCityList.add("湖南省衡阳市");
        provinceCityList.add("湖南省益阳市");
        provinceCityList.add("湖南省湘西土家族苗族自治州");
        provinceCityList.add("湖南省湘潭市");
        provinceCityList.add("湖南省永州市");
        provinceCityList.add("湖南省株洲市");
        provinceCityList.add("湖南省怀化市");
        provinceCityList.add("湖南省张家界市");
        provinceCityList.add("湖南省常德市");
        provinceCityList.add("湖南省岳阳市");
        provinceCityList.add("湖南省娄底市");
        provinceCityList.add("湖北省黄石市");
        provinceCityList.add("湖北省黄冈市");
        provinceCityList.add("湖北省随州市");
        provinceCityList.add("湖北省鄂州市");
        provinceCityList.add("湖北省襄樊市");
        provinceCityList.add("湖北省荆门市");
        provinceCityList.add("湖北省荆州市");
        provinceCityList.add("湖北省神农架");
        provinceCityList.add("湖北省武汉市");
        provinceCityList.add("湖北省恩施土家族苗族自治州");
        provinceCityList.add("湖北省宜昌市");
        provinceCityList.add("湖北省孝感市");
        provinceCityList.add("湖北省咸宁市");
        provinceCityList.add("湖北省十堰市");
        provinceCityList.add("海南省海口市");
        provinceCityList.add("海南省三亚市");
        provinceCityList.add("浙江省金华市");
        provinceCityList.add("浙江省衢州市");
        provinceCityList.add("浙江省舟山市");
        provinceCityList.add("浙江省绍兴市");
        provinceCityList.add("浙江省湖州市");
        provinceCityList.add("浙江省温州市");
        provinceCityList.add("浙江省杭州市");
        provinceCityList.add("浙江省宁波市");
        provinceCityList.add("浙江省嘉兴市");
        provinceCityList.add("浙江省台州市");
        provinceCityList.add("浙江省丽水市");
        provinceCityList.add("河南省鹤壁市");
        provinceCityList.add("河南省驻马店市");
        provinceCityList.add("河南省郑州市");
        provinceCityList.add("河南省许昌市");
        provinceCityList.add("河南省焦作市");
        provinceCityList.add("河南省濮阳市");
        provinceCityList.add("河南省漯河市");
        provinceCityList.add("河南省洛阳市");
        provinceCityList.add("河南省新乡市");
        provinceCityList.add("河南省开封市");
        provinceCityList.add("河南省平顶山市");
        provinceCityList.add("河南省安阳市");
        provinceCityList.add("河南省商丘市");
        provinceCityList.add("河南省周口市");
        provinceCityList.add("河南省南阳市");
        provinceCityList.add("河南省信阳市");
        provinceCityList.add("河南省三门峡市");
        provinceCityList.add("河北省邯郸市");
        provinceCityList.add("河北省邢台市");
        provinceCityList.add("河北省衡水市");
        provinceCityList.add("河北省秦皇岛市");
        provinceCityList.add("河北省石家庄市");
        provinceCityList.add("河北省沧州市");
        provinceCityList.add("河北省承德市");
        provinceCityList.add("河北省张家口市");
        provinceCityList.add("河北省廊坊市");
        provinceCityList.add("河北省唐山市");
        provinceCityList.add("河北省保定市");
        provinceCityList.add("江西省鹰潭市");
        provinceCityList.add("江西省赣州市");
        provinceCityList.add("江西省萍乡市");
        provinceCityList.add("江西省景德镇市");
        provinceCityList.add("江西省新余市");
        provinceCityList.add("江西省抚州市");
        provinceCityList.add("江西省宜春市");
        provinceCityList.add("江西省吉安市");
        provinceCityList.add("江西省南昌市");
        provinceCityList.add("江西省九江市");
        provinceCityList.add("江西省上饶市");
        provinceCityList.add("江苏省镇江市");
        provinceCityList.add("江苏省连云港市");
        provinceCityList.add("江苏省苏州市");
        provinceCityList.add("江苏省盐城市");
        provinceCityList.add("江苏省淮安市");
        provinceCityList.add("江苏省泰州市");
        provinceCityList.add("江苏省无锡市");
        provinceCityList.add("江苏省扬州市");
        provinceCityList.add("江苏省徐州市");
        provinceCityList.add("江苏省常州市");
        provinceCityList.add("江苏省宿迁市");
        provinceCityList.add("江苏省南通市");
        provinceCityList.add("江苏省南京市");
        provinceCityList.add("新疆维吾尔自治区阿拉尔市");
        provinceCityList.add("新疆维吾尔自治区阿勒泰地区");
        provinceCityList.add("新疆维吾尔自治区阿克苏地区");
        provinceCityList.add("新疆维吾尔自治区石河子市");
        provinceCityList.add("新疆维吾尔自治区昌吉回族自治州");
        provinceCityList.add("新疆维吾尔自治区巴音郭楞蒙古自治州");
        provinceCityList.add("新疆维吾尔自治区塔城地区");
        provinceCityList.add("新疆维吾尔自治区图木舒克市");
        provinceCityList.add("新疆维吾尔自治区喀什地区");
        provinceCityList.add("新疆维吾尔自治区哈密地区");
        provinceCityList.add("新疆维吾尔自治区和田地区");
        provinceCityList.add("新疆维吾尔自治区吐鲁番地区");
        provinceCityList.add("新疆维吾尔自治区博尔塔拉蒙古自治州");
        provinceCityList.add("新疆维吾尔自治区克拉玛依市");
        provinceCityList.add("新疆维吾尔自治区克孜勒苏柯尔克孜自治州");
        provinceCityList.add("新疆维吾尔自治区伊犁哈萨克自治州");
        provinceCityList.add("新疆维吾尔自治区五家渠市");
        provinceCityList.add("新疆维吾尔自治区乌鲁木齐市");
        provinceCityList.add("广西壮族自治区防城港市");
        provinceCityList.add("广西壮族自治区钦州市");
        provinceCityList.add("广西壮族自治区贺州市");
        provinceCityList.add("广西壮族自治区贵港市");
        provinceCityList.add("广西壮族自治区百色市");
        provinceCityList.add("广西壮族自治区玉林市");
        provinceCityList.add("广西壮族自治区河池市");
        provinceCityList.add("广西壮族自治区梧州市");
        provinceCityList.add("广西壮族自治区桂林市");
        provinceCityList.add("广西壮族自治区柳州市");
        provinceCityList.add("广西壮族自治区来宾市");
        provinceCityList.add("广西壮族自治区崇左市");
        provinceCityList.add("广西壮族自治区南宁市");
        provinceCityList.add("广西壮族自治区北海市");
        provinceCityList.add("广东省韶关市");
        provinceCityList.add("广东省阳江市");
        provinceCityList.add("广东省茂名市");
        provinceCityList.add("广东省肇庆市");
        provinceCityList.add("广东省珠海市");
        provinceCityList.add("广东省潮州市");
        provinceCityList.add("广东省湛江市");
        provinceCityList.add("广东省清远市");
        provinceCityList.add("广东省深圳市");
        provinceCityList.add("广东省河源市");
        provinceCityList.add("广东省江门市");
        provinceCityList.add("广东省汕尾市");
        provinceCityList.add("广东省汕头市");
        provinceCityList.add("广东省梅州市");
        provinceCityList.add("广东省揭阳市");
        provinceCityList.add("广东省惠州市");
        provinceCityList.add("广东省广州市");
        provinceCityList.add("广东省佛山市");
        provinceCityList.add("广东省云浮市");
        provinceCityList.add("广东省中山市");
        provinceCityList.add("广东省东莞市");
        provinceCityList.add("山西省阳泉市");
        provinceCityList.add("山西省长治市");
        provinceCityList.add("山西省运城市");
        provinceCityList.add("山西省朔州市");
        provinceCityList.add("山西省晋城市");
        provinceCityList.add("山西省晋中市");
        provinceCityList.add("山西省忻州市");
        provinceCityList.add("山西省太原市");
        provinceCityList.add("山西省大同市");
        provinceCityList.add("山西省吕梁市");
        provinceCityList.add("山西省临汾市");
        provinceCityList.add("山东省青岛市");
        provinceCityList.add("山东省菏泽市");
        provinceCityList.add("山东省莱芜市");
        provinceCityList.add("山东省聊城市");
        provinceCityList.add("山东省烟台市");
        provinceCityList.add("山东省潍坊市");
        provinceCityList.add("山东省滨州市");
        provinceCityList.add("山东省淄博市");
        provinceCityList.add("山东省济宁市");
        provinceCityList.add("山东省济南市");
        provinceCityList.add("山东省泰安市");
        provinceCityList.add("山东省枣庄市");
        provinceCityList.add("山东省日照市");
        provinceCityList.add("山东省德州市");
        provinceCityList.add("山东省威海市");
        provinceCityList.add("山东省临沂市");
        provinceCityList.add("山东省东营市");
        provinceCityList.add("安徽省黄山市");
        provinceCityList.add("安徽省马鞍山市");
        provinceCityList.add("安徽省阜阳市");
        provinceCityList.add("安徽省铜陵市");
        provinceCityList.add("安徽省蚌埠市");
        provinceCityList.add("安徽省芜湖市");
        provinceCityList.add("安徽省滁州市");
        provinceCityList.add("安徽省淮南市");
        provinceCityList.add("安徽省淮北市");
        provinceCityList.add("安徽省池州市");
        provinceCityList.add("安徽省巢湖市");
        provinceCityList.add("安徽省宿州市");
        provinceCityList.add("安徽省宣城市");
        provinceCityList.add("安徽省安庆市");
        provinceCityList.add("安徽省合肥市");
        provinceCityList.add("安徽省六安市");
        provinceCityList.add("安徽省亳州市");
        provinceCityList.add("宁夏回族自治区银川市");
        provinceCityList.add("宁夏回族自治区石嘴山市");
        provinceCityList.add("宁夏回族自治区固原市");
        provinceCityList.add("宁夏回族自治区吴忠市");
        provinceCityList.add("宁夏回族自治区中卫市");
        provinceCityList.add("天津市天津市");
        provinceCityList.add("四川省雅安市");
        provinceCityList.add("四川省阿坝藏族羌族自治州");
        provinceCityList.add("四川省遂宁市");
        provinceCityList.add("四川省达州市");
        provinceCityList.add("四川省资阳市");
        provinceCityList.add("四川省自贡市");
        provinceCityList.add("四川省绵阳市");
        provinceCityList.add("四川省眉山市");
        provinceCityList.add("四川省甘孜藏族自治州");
        provinceCityList.add("四川省泸州市");
        provinceCityList.add("四川省攀枝花市");
        provinceCityList.add("四川省成都市");
        provinceCityList.add("四川省德阳市");
        provinceCityList.add("四川省广安市");
        provinceCityList.add("四川省广元市");
        provinceCityList.add("四川省巴中市");
        provinceCityList.add("四川省宜宾市");
        provinceCityList.add("四川省南充市");
        provinceCityList.add("四川省凉山彝族自治州");
        provinceCityList.add("四川省内江市");
        provinceCityList.add("四川省乐山市");
        provinceCityList.add("吉林省长春市");
        provinceCityList.add("吉林省通化市");
        provinceCityList.add("吉林省辽源市");
        provinceCityList.add("吉林省白山市");
        provinceCityList.add("吉林省白城市");
        provinceCityList.add("吉林省松原市");
        provinceCityList.add("吉林省延边朝鲜族自治州");
        provinceCityList.add("吉林省四平市");
        provinceCityList.add("吉林省吉林市");
        provinceCityList.add("台湾省台湾省");
        provinceCityList.add("北京市北京市");
        provinceCityList.add("内蒙古自治区阿拉善盟");
        provinceCityList.add("内蒙古自治区锡林郭勒盟");
        provinceCityList.add("内蒙古自治区鄂尔多斯市");
        provinceCityList.add("内蒙古自治区通辽市");
        provinceCityList.add("内蒙古自治区赤峰市");
        provinceCityList.add("内蒙古自治区巴彦淖尔市");
        provinceCityList.add("内蒙古自治区呼和浩特市");
        provinceCityList.add("内蒙古自治区呼伦贝尔市");
        provinceCityList.add("内蒙古自治区包头市");
        provinceCityList.add("内蒙古自治区兴安盟");
        provinceCityList.add("内蒙古自治区乌海市");
        provinceCityList.add("内蒙古自治区乌兰察布市");
        provinceCityList.add("云南省迪庆藏族自治州");
        provinceCityList.add("云南省西双版纳傣族自治州");
        provinceCityList.add("云南省红河哈尼族彝族自治州");
        provinceCityList.add("云南省玉溪市");
        provinceCityList.add("云南省楚雄彝族自治州");
        provinceCityList.add("云南省曲靖市");
        provinceCityList.add("云南省普洱市");
        provinceCityList.add("云南省昭通市");
        provinceCityList.add("云南省昆明市");
        provinceCityList.add("云南省文山壮族苗族自治州");
        provinceCityList.add("云南省怒江傈僳族自治州");
        provinceCityList.add("云南省德宏傣族景颇族自治州");
        provinceCityList.add("云南省大理白族自治州");
        provinceCityList.add("云南省保山市");
        provinceCityList.add("云南省丽江市");
        provinceCityList.add("云南省临沧市");
        provinceCityList.add("上海市上海市");
    }

    public static String generate() {
        StringBuilder result = new StringBuilder(genProvinceAndCity());
        result.append(ChineseCharUtils.genRandomLengthChineseChars(2, 3) + "路");
        result.append(RandomUtils.nextInt(10, 8000) + "号");
        result
            .append(ChineseCharUtils.genRandomLengthChineseChars(2, 3) + "小区");
        result.append(RandomUtils.nextInt(1, 8000) + "单元");
        result.append(RandomUtils.nextInt(101, 2500) + "室");
        return result.toString();
    }

    private static String genProvinceAndCity() {
        return provinceCityList
            .get(RandomUtils.nextInt(0, provinceCityList.size()));
    }

}
