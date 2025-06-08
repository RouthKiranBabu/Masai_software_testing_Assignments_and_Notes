function change_image(){
        const animal = document.getElementById("animal").value
        const image = document.getElementById("image_tag")
        image.src = animal;
}