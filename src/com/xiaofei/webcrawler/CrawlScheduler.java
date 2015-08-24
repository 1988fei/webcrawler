package com.xiaofei.webcrawler;

/** 
 * ��ҳ����ű��������. ִ�д˽ű���˳���ṩ��������:
 * 
 * 1. Ŀ����ҳ��URL���Ե�ַ, ��: http://www.baidu.com
 * 2. ��Ŀ����ҳ�Ĳ���ָ��, ��: click��ʾ���
 * 3. �����ĸ��Ӳ���, ���Ǳ���ģ���clickʱΪ�ؼ��� 
 * 4. α��ķ�����Դ��ַ, ��: http://xxx.com
 */ 
public class CrawlScheduler {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "https://www.baidu.com";
		String cmd = "click";
		String param = "yohoboys";
		String referer = "http://www.baidu.com";
		
		if (args.length > 0) {
			url = String.valueOf(args[0]);
		}
		if (args.length > 1) {
			cmd = String.valueOf(args[1]);
		}
		if (args.length > 2) {
			param = String.valueOf(args[2]);
		}
		if (args.length > 3) {
			referer = String.valueOf(args[3]);
		}
		
		CrawlWorker worker = new CrawlWorker(url, cmd, param, referer);
		Thread crawler = new Thread(worker);
		crawler.start();
	}
	
}
