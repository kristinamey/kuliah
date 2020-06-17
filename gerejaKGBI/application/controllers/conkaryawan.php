<?php
defined('BASEPATH') OR exit('No direct script access allowed');

class conkaryawan extends CI_Controller {


	function __construct()
	{
		parent::__construct();		
        $this->load->model('M_admin');
        $this->load->helper('url');
		if ($this->session->userdata('status') != "login") {
			redirect(base_url("login"));
		}
	}

	public function index()	{
		$data['admin'] = $this->M_admin->tampil_data()->result();
		$this->load->view('headeradmin', $data);
		$this->load->view('karyawan', $data);
		$this->load->view('footeradmin', $data);
	}

	public function add(){
	    $idAdmin = $this->input->post('idAdmin');
	    if($this->M_admin->cek_data($idAdmin)->num_rows() != 0){
	    	$this->M_admin->ubah_data($idAdmin);
	    }else {
            $this->M_admin->tambah_data();
		}
    }

    public function hapus(){
        $idAdmin = $this->input->post('idAdmin1');
        $this->M_admin->hapus_data($idAdmin);
            
    }
}
?>
