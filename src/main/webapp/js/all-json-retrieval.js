$("#home").live("pagebeforeshow",function(e,ui){

});
$("#people").live("pagebeforeshow",function(e,ui){
	// Make sure to call a .listview('refresh') on the modified list in DOM
	// Example: $(this).find('#peoplelist').append('<li><a href="#">Check Personlol</a></li>').listview('refresh');
	$(this).find('#peoplelist').append('<li><a href="#">Test Personlol</a></li>');
	sortUnorderedList('#peoplelist');
	$(this).find('#peoplelist').listview('refresh');
});
$("#events").live("pagebeforeshow",function(e,ui){
	
});
$("#tasks").live("pagebeforeshow",function(e,ui){
	
});

//Helper method - Sort list alphabetically
function sortUnorderedList(ul){
	if(typeof ul == "string"){
		ul = document.getElementById(ul);
	}
	
	if(!ul){
		alert("The UL object is null!");
		return;
	}
	
	// Get the list items and setup an array for sorting
	var lis = ul.getElementsByTagName("li");
	var vals = [];

	// Populate the array then sort
	for(var i = 0, l = lis.length; i < l; i++){
		vals.push(lis[i].innerHTML);
	}
	vals.sort();

	// Change the list on the page
	for(var i = 0, l = lis.length; i < l; i++){
		lis[i].innerHTML = vals[i];
	}
}
