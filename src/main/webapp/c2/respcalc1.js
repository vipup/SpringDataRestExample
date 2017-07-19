var percentage = $("#percentage").css("width", "50%");
if (percentage.width() == 0) percentage.addClass("fail");

var pixel = $("#pixel").css("width", "400px");
if (pixel.width() == 0) pixel.addClass("fail");

var em = $("#em").css("width", "20em");
if (em.width() == 0) em.addClass("fail");

var rem = $("#rem").css("width", "20rem");
if (rem.width() == 0) rem.addClass("fail");

var vw = $("#vw").css("width", "55vw");
if (vw.width() == 0) vw.addClass("fail");

var vh = $("#vh").css("width", "60vh");
if (vh.width() == 0) vh.addClass("fail");

var vmin = $("#vmin").css("width", "60vmin");
if (vmin.width() == 0) vmin.addClass("fail");

var vmax = $("#vmax").css("width", "60vmax");
if (vmax.width() == 0) vmax.addClass("fail");

var inch = $("#inch").css("width", "4in");
if (inch.width() == 0) inch.addClass("fail");

var cm = $("#cm").css("width", "20cm");
if (cm.width() == 0) cm.addClass("fail");

var mm = $("#mm").css("width", "200mm");
if (mm.width() == 0) mm.addClass("fail");

var pt = $("#pt").css("width", "120pt");
if (pt.width() == 0) pt.addClass("fail");

var pc = $("#pc").css("width", "40pc");
if (pc.width() == 0) pc.addClass("fail");

var ex = $("#ex").css("width", "60ex");
if (ex.width() == 0) ex.addClass("fail");

var ch = $("#ch").css("width", "60ch");
if (ch.width() == 0) ch.addClass("fail");