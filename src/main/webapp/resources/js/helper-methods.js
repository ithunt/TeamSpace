//Clear out newtask input fields
jq("#newtask").live("pagebeforeshow",function(e,ui){
    jq("#title").val('');
    jq("#targetdate").val('');
    jq("#priority").val('');
    jq("#description").val('');
    jq("#result").html('');
});

//Clear out newevent input fields
jq("#newevent").live("pagebeforeshow",function(e,ui){
    jq("#title").val('');
    jq("#targetdate").val('');
    jq("#targettime").val('');
    jq("#description").val('');
    jq("#result").html('');
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
