package cn.com.jtang.quartz;

import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.scheduling.quartz.AdaptableJobFactory;

public class MyJobFactory extends AdaptableJobFactory {

	@Autowired
    private AutowireCapableBeanFactory capableBeanFactory;
	
	@Override
	protected Object createJobInstance(TriggerFiredBundle bundle)
			throws Exception {
		// TODO Auto-generated method stub
		//调用父类的方法
        Object jobInstance = super.createJobInstance(bundle);
        //进行注入,这属于Spring的技术,不清楚的可以查看Spring的API.
        capableBeanFactory.autowireBean(jobInstance);
        return jobInstance;
	}
	
}
