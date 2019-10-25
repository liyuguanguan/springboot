package com.example.demo.controller;


import com.example.demo.dto.ResponseDTO;
import com.example.demo.dto.TableDataDTO;
import com.example.demo.dto.TotalDetailDTO;
import com.example.demo.mybaties.model.IadtCpiNaciDetail;
import com.example.demo.mybaties.model.IadtCpiNaciTotal;
import com.example.demo.service.IadtCpiNaciDetailService;
import com.example.demo.service.IadtCpiNaciTotalService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("detail")
public class IadtCpiNaciDetailController {

    @Autowired
    private IadtCpiNaciDetailService iadtCpiNaciDetailService;

    @Autowired
    private IadtCpiNaciTotalService iadtCpiNaciTotalService;





    @RequestMapping(value = "insert")
    public ModelAndView insert() throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("total_add");
        return modelAndView;
    }

    @RequestMapping(value = "add")
    @ResponseBody
    public ResponseDTO add(Integer totalId, Integer detailId, IadtCpiNaciTotal iadtCpiNaciTotal, IadtCpiNaciDetail iadtCpiNaciDetail, String[] str){
        iadtCpiNaciTotal.setId(totalId);
        iadtCpiNaciDetail.setId(detailId);
        Integer resutlId = iadtCpiNaciTotalService.addOrInsert(iadtCpiNaciTotal);
        if (totalId==null){
            iadtCpiNaciDetail.setTotalId(resutlId);
        }
        iadtCpiNaciDetailService.insert(iadtCpiNaciDetail, str);
//        iadtCpiNaciDetailService
        ResponseDTO dto = new ResponseDTO();
        dto.setCode(200);
        return dto;
    }

    @RequestMapping(value = "update")
    @ResponseBody
    public ResponseDTO update(String[] str,Integer totalId,Integer detailId,IadtCpiNaciTotal iadtCpiNaciTotal,IadtCpiNaciDetail iadtCpiNaciDetail){
        iadtCpiNaciTotal.setId(totalId);
        iadtCpiNaciDetail.setId(detailId);
        iadtCpiNaciTotalService.addOrInsert(iadtCpiNaciTotal);
        iadtCpiNaciDetailService.update(iadtCpiNaciDetail, str);
        ResponseDTO dto = new ResponseDTO();
        dto.setCode(200);
        return dto;
    }


    /**
     * 打开修改页面
     * @param id
     * @return
     */
    @RequestMapping(value="modify")
    public ModelAndView modify(Integer id){
        ModelAndView modelAndView = new ModelAndView();
        IadtCpiNaciDetail cpiNaciDetail = iadtCpiNaciDetailService.byid(id);
        modelAndView.addObject("detail", cpiNaciDetail);
        modelAndView.addObject("total", iadtCpiNaciTotalService.byId(cpiNaciDetail.getTotalId()));
        modelAndView.setViewName("total_modify");
        return  modelAndView;
    }

    @RequestMapping("all")
    @ResponseBody
    public TableDataDTO getadd(@RequestParam(value="page",defaultValue = "1") int page, @RequestParam(value="limit",defaultValue = "10") int limit){
        List<TotalDetailDTO> all = iadtCpiNaciDetailService.getAll(page, limit);
        TableDataDTO tableDataDTO = new TableDataDTO();
        PageInfo TotalDetailDTO = new PageInfo(all);
        tableDataDTO.setCount(TotalDetailDTO.getTotal());
        tableDataDTO.setMsg("");
        tableDataDTO.setData(TotalDetailDTO.getList());
        return tableDataDTO;
    }

    @RequestMapping("del")
    public void del(Integer id){
        iadtCpiNaciDetailService.delete(id);
    }

    @RequestMapping("totalall")
    public ModelAndView totoalAll(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("total_all");
        return  modelAndView;
    }
}
