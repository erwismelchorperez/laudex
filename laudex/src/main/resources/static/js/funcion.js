function eliminar(id){
  swal({
    title: "Esta seguro de eliminar?" ,
    text: "",
    icon: "warning",
    buttons: true,
    dangerMode: true,
  })
  .then((OK) => {
    if(OK){
      $.ajax({
        url:"/eliminar/"+id,
        success: function(res){
          console.log(res);
        }
      });
      swal("pooff eloimaskdasd ",{
        icon: "success",
      }).then((OK)=>{
        if(OK){
          location.href="/list";
        }
      });
    }else{
      swal("guardado kaskdkasda");
    }
  });
}
