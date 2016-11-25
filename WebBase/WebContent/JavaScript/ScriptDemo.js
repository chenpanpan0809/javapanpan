/**
 *
 */
function demo() {
	document.write("nice to meet you");
}
function demo1() {
	
	var len1 =navigator.appCodeName;
	var len2 =navigator.appName;
	var len3=navigator.appVersion;
	var len4 = navigator.plugins.length;
	with(document){
		
		write(len1+"<br/>");
		write(len2+"<br/>");
		write(len3+"<br/>");
		write(len4);
	}
	
}
function demo3() {
	var window1 = windows.name;
}
