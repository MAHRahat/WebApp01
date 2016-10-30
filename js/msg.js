function init(succed)
{
	var c = document.getElementById("emocanvas");
	var context = c.getContext('2d');
	var rad = c.width < c.height ? c.width / 2 : c.height / 2;
	rad = 0.9 * rad;
	context.beginPath();
	context.fillStyle = "yellow";
	context.arc(c.width / 2, c.height / 2, rad, 0, 2 * Math.PI, false);
	context.fill();
	context.strokeStyle = "black";
	context.beginPath();
	context.arc(c.width / 2, c.height / 2, rad, 0, 2 * Math.PI, false);
	context.stroke();
	context.beginPath();
	context.arc(c.width / 3, 0.35 * c.height, rad / 5, 0, 2 * Math.PI, false);
	context.stroke();
	context.beginPath();
	context.arc(2 * c.width / 3, 0.35 * c.height, rad / 5, 0, 2 * Math.PI, false);
	context.stroke();
	if (succed)
	{
		context.beginPath();
		context.arc(c.width / 2, 0.55 * c.height, rad / 2, 0.5, Math.PI - 0.5, false);
		context.stroke();
	}
	else
	{
		context.beginPath();
		context.arc(c.width / 2, 0.8 * c.height, rad / 2, -0.5, Math.PI + 0.5, true);
		context.stroke();
	}
}
