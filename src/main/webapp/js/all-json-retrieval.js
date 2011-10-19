$("#home").live("pagebeforeshow",function(e,ui){

});
$("#people").live("pagebeforeshow",function(e,ui){
    // Make sure to call a .listview('refresh') on the modified list in DOM
	$(this).find('#peoplelist').append('<li><a href="viewcontact.htm">Random Person</a></li>').listview('refresh');
	sortUnorderedList($(this).find('#peoplelist'));
	$(this).find('#peoplelist').listview('refresh');
});
$("#events").live("pagebeforeshow",function(e,ui){
	
});
$("#tasks").live("pagebeforeshow",function(e,ui){
	
});

//Helper method - Sort list alphabetically
function sortUnorderedList(ul){	
	if(!ul){
		console.log("The ul object is null! Cannot sort list..");
		return;
	}
	
	// Get the list items and setup an array for sorting
	var lis = ul.find('li');
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