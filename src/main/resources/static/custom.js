var map;
function initMap() {

    let image = {url: '/bus.png', 
        scaledSize: new google.maps.Size(40, 40)};

    
    map = new google.maps.Map(document.getElementById('map'), {
        center: { lat: parseFloat(busLocations[0].LATITUDE), lng: parseFloat(busLocations[0].LONGITUDE) },
        zoom: 15,
        scrollwheel: false
    });

    
    var marker = new google.maps.Marker({
        position: { lat: parseFloat(myLocation.lat), lng: parseFloat(myLocation.lng) },
        map: map
    });

    for (i=0; i<busLocations.length; i++){
        var marker = new google.maps.Marker({
            icon: image,
            position: { lat: parseFloat(busLocations[i].LATITUDE), lng: parseFloat(busLocations[i].LONGITUDE) },
            clickable: true,
            map: map
        });
        
        marker.info = new google.maps.InfoWindow({
            content: '<h2> ' + busLocations[i].VEHICLE + ' </h2>'
        });
    
        google.maps.event.addListener(marker, 'click', function() {
            var marker_map = this.getMap();
            this.info.open(marker_map, this);
        });

      
    
    }
}