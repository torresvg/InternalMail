
function modalenvio() {
  const swalWithBootstrapButtons = Swal.mixin({
    customClass: {
      confirmButton: 'btn btn-success',
      cancelButton: 'btn btn-danger'
    },
    buttonsStyling: false
  })
  
  swalWithBootstrapButtons.fire({
    title: '¿Desea enviar el acta?',
    text: "Recuerde  !No puede retroceder esta acción!",
    icon: '',
    showCancelButton: true,
    confirmButtonText: 'Si, Enviar!',
    cancelButtonText: 'No, Cancelar!',
    reverseButtons: true
  }).then((result) => {
    if (result.isConfirmed) {
      swalWithBootstrapButtons.fire(
        'Enviado!',
        'El acta se envio correctamente',
        'success'
      )
    }
    else if (
      result.dismiss === Swal.DismissReason.cancel
    ) {
      swalWithBootstrapButtons.fire(
        'Cancelado',
        'La acción fue cancelada',
        'error'
      )
    }
  })
}
