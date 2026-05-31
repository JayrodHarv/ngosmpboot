package com.jayrodharv.ngosmpboot.util;

import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class FlashUtil {

    public static void success(RedirectAttributes ra, String msg) {
        ra.addFlashAttribute("flash", new FlashMessage("success", msg));
    }

    public static void danger(RedirectAttributes ra, String msg) {
        ra.addFlashAttribute("flash", new FlashMessage("danger", msg));
    }

    public static void warning(RedirectAttributes ra, String msg) {
        ra.addFlashAttribute("flash", new FlashMessage("warning", msg));
    }

    public static void info(RedirectAttributes ra, String msg) {
        ra.addFlashAttribute("flash", new FlashMessage("info", msg));
    }
    
}
