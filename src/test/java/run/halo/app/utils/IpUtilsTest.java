package run.halo.app.utils;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

public class IpUtilsTest {

    @Test
    public void getRegionTest() throws IOException {
        IpUtils.IpRegion ipRegionOne = IpUtils.getRegion("101.105.35.57");
        Assert.assertEquals("中国", ipRegionOne.getCountry());
        Assert.assertEquals("广东省", ipRegionOne.getProvince());
        Assert.assertEquals("深圳市", ipRegionOne.getCity());
        Assert.assertEquals("鹏博士", ipRegionOne.getIsp());
        Assert.assertEquals("中国广东省深圳市鹏博士", ipRegionOne.toString());

        IpUtils.IpRegion ipRegionTwo = IpUtils.getRegion("199.43.0.47");
        Assert.assertEquals("美国", ipRegionTwo.getCountry());
        Assert.assertEquals("弗吉尼亚", ipRegionTwo.getProvince());
        Assert.assertEquals("阿什本", ipRegionTwo.getCity());
        Assert.assertEquals("", ipRegionTwo.getIsp());
        Assert.assertEquals("美国弗吉尼亚阿什本", ipRegionTwo.toString());

        IpUtils.IpRegion ipRegionThree = IpUtils.getRegion("192.168.1.1");
        Assert.assertEquals("", ipRegionThree.getCountry());
        Assert.assertEquals("", ipRegionThree.getCity());
        Assert.assertEquals("内网IP", ipRegionThree.getIsp());
        Assert.assertEquals("内网IP", ipRegionThree.toString());
    }

}
